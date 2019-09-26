package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="order")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to OrderStatus
	@ManyToOne
	@JoinColumn(name="order_status_id", nullable=false)
	private OrderStatus orderStatus;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;
	
	private RestaurantTable table;
}