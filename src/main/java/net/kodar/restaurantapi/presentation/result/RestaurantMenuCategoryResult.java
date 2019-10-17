package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


/**
 * The persistent class for the restaurant_menu_category database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class RestaurantMenuCategoryResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}