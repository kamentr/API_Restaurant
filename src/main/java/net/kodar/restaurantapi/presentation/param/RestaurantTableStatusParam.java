package net.kodar.restaurantapi.presentation.param;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

@Data
@EqualsAndHashCode(callSuper=true)
public class RestaurantTableStatusParam extends NamedPersistent implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
