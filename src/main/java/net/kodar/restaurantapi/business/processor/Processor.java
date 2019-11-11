package net.kodar.restaurantapi.business.processor;

import java.util.List;

import javax.validation.ValidationException;

public interface Processor<IN, OUT, PK> {

    OUT get(PK id);

    List<OUT> getAll();

    OUT save(IN param) throws ValidationException;

    void update(IN param) throws ValidationException;

    void delete(PK id);
}
