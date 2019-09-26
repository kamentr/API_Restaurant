package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the restaurant_menu database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="restaurant_menu")
@NamedQuery(name="RestaurantMenu.findAll", query="SELECT r FROM RestaurantMenu r")
public class RestaurantMenu extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private LifecycleStatus lifecycleStatus;

	//bi-directional many-to-one association to RestaurantMenuStatus
	@ManyToOne
	@JoinColumn(name="menu_status_id", nullable=false)
	private RestaurantMenuStatus restaurantMenuStatus;

	//bi-directional many-to-one association to RestaurantMenuCategory
	@ManyToOne
	@JoinColumn(name="restaurant_menu_category_id", nullable=false)
	private RestaurantMenuCategory restaurantMenuCategory;
}