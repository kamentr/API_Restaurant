package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the menu_item database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class MenuItemResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	//bi-directional many-to-one association to Measure
	@ManyToOne
	@JoinColumn(name="measure_id", nullable=false)
	private Measure measure;
}