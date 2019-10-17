package net.kodar.restaurantapi.business.processor;

import org.springframework.beans.factory.annotation.Autowired;

import net.kodar.restaurantapi.business.validator.GenericValidator;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

import javax.validation.ValidationException;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class ProcessorGenericImpl
        <IN, OUT, PK, ENT,
                DAO extends DaoGenericImpl<ENT, PK>,
                PTR extends BiFunction<IN, ENT, ENT>,
                RTR extends Function<ENT, OUT>,
                VAL extends GenericValidator<IN>>
        implements Processor<IN, OUT, PK> {

    public abstract PK getID(IN param);

    @Autowired
    protected DAO dao;
    @Autowired
    protected PTR ptr;
    @Autowired
    protected RTR rtr;
    
    @Autowired
    protected VAL val;


    @Override
    public OUT get(PK id) {
            OUT out = rtr.apply(dao.get(id)); 
            
            return out;
    }

    @Override
    public List<OUT> getAll() {
        List<ENT> list = dao.getAll();

        List<OUT> entResults = list
                .stream()
                .map(s -> rtr.apply(s))
                .collect(Collectors.toList());

        return entResults;
    }

    @Override
    public OUT save(IN param) throws ValidationException {

        val.validate(param);

        ENT entToSave = ptr.apply(param, null);
        ENT save = dao.save(entToSave);

        return rtr.apply(save);
    }

    @Override
    public void update(IN param) throws ValidationException {

        val.validate(param);

        ENT entity = dao.get(getID(param));

        if (null != entity) {
            ENT entToUpdate = ptr.apply(param, entity);
            dao.update(entToUpdate);
        } else {
            throw new NullPointerException();
        }

    }

    @Override
    public void delete(PK id) {
        dao.delete(id);
    }
   
}
