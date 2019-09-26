package net.kodar.restaurantapi.business.validator;

import javax.validation.ValidationException;

public interface GenericValidator<T> {

    void validate(T object) throws ValidationException;

}
