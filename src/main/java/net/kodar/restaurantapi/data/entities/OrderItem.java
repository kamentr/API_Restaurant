package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="order_item")
@NamedQuery(name="OrderItem.findAll", query="SELECT o FROM OrderItem o")
public class OrderItem extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	@Column(nullable=false)
	private int quantity;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;

}