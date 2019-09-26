package net.kodar.restaurantapi.dataaccess.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


public abstract class DaoGenericImpl<ENT, PK> implements Dao<ENT, PK> {

	protected abstract PK getId(ENT entity);

    @Autowired
    protected CrudRepository<ENT, PK> repository;

    @Override
    public ENT get(PK id){
        Optional<ENT> entity = repository.findById(id);

        if(entity.isPresent()){
            return entity.get();
        }else {
            throw new IllegalArgumentException("Incorrect id");
        }
    }

    @Override
    public List<ENT> getAll() {

        Iterable<ENT> entList = repository.findAll();
        List<ENT> resultList = new ArrayList<ENT>();
        entList.forEach(resultList::add);
        
        return resultList;

    }

    @Override
    public ENT save(ENT entity) {
        if (entity != null) {

            return repository.save(entity);

        }
        return null;
    }

    @Override
    public void update(ENT entity) {
        Optional<ENT> entityToUpdate = repository.findById(getId(entity));

        entityToUpdate.ifPresent(ent -> repository.save(entity));
    }

    @Override
    public void delete(PK id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
        }else {
            throw new IllegalArgumentException("Object not found");
        }
    }
}

