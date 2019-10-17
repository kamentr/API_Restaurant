package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.Product;

import java.math.BigDecimal;


/**
 * The persistent class for the order_item database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderItemResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	@Column(nullable=false)
	private int quantitty;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;

}