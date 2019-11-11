package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;


/**
 * The persistent class for the restaurant_menu database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class RestaurantMenuParam extends NamedPersistent implements Serializable {
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