package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


/**
 * The persistent class for the order_status database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderStatusParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}