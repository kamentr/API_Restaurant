package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


/**
 * The persistent class for the product database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	//bi-directional many-to-one association to LifecycleStatus
	@ManyToOne
	@JoinColumn(name="status_id", nullable=false)
	private LifecycleStatus lifecycleStatus;

	//bi-directional many-to-one association to Measure
	@ManyToOne
	@JoinColumn(name="measure_id", nullable=false)
	private Measure measure;

	//bi-directional many-to-one association to ProductStatus
	@ManyToOne
	@JoinColumn(name="product_status_id", nullable=false)
	private ProductStatus productStatus;
}