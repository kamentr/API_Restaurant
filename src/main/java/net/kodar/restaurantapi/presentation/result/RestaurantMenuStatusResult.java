package net.kodar.restaurantapi.presentation.result;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
public class RestaurantMenuStatusResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}