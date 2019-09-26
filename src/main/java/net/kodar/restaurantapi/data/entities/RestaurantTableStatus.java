package net.kodar.restaurantapi.data.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class RestaurantTableStatus extends NamedPersistent implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
