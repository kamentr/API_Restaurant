package net.kodar.restaurantapi.data.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class RestaurantTable extends NamedPersistent implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="table_status_id", nullable=false)
	private RestaurantTableStatus restaurantTableStatus;
}
