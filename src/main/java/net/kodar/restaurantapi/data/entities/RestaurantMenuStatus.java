package net.kodar.restaurantapi.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="restaurant_menu_status")
@NamedQuery(name="RestaurantMenuStatus.findAll", query="SELECT r FROM RestaurantMenuStatus r")
public class RestaurantMenuStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}