package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * The persistent class for the restaurant_menu_category database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="restaurant_menu_category")
@NamedQuery(name="RestaurantMenuCategory.findAll", query="SELECT r FROM RestaurantMenuCategory r")
public class RestaurantMenuCategory extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}