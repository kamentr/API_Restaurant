package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


/**
 * The persistent class for the menu_item database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="menu_item")
@NamedQuery(name="MenuItem.findAll", query="SELECT m FROM MenuItem m")
public class MenuItem extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	//bi-directional many-to-one association to Measure
	@ManyToOne
	@JoinColumn(name="measure_id", nullable=false)
	private Measure measure;
}