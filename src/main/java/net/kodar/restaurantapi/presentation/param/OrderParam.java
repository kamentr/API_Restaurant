package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.OrderStatus;

@Data
@EqualsAndHashCode(callSuper=true)
public class OrderParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to OrderStatus
	@ManyToOne
	@JoinColumn(name="order_status_id", nullable=false)
	private OrderStatus orderStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;
}