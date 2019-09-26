package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.ProductStatus;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ProductParam extends NamedPersistent implements Serializable {
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