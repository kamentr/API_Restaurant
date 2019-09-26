package net.kodar.restaurantapi.presentation.param;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;

@Data
@EqualsAndHashCode(callSuper=true)
public class RestaurantTableParam extends NamedPersistent implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RestaurantTableStatus restaurantTavbleStatus;
}
