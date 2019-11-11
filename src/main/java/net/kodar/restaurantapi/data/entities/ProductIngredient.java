package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="product_ingredient")
@NamedQuery(name="ProductIngredient.findAll", query="SELECT p FROM ProductIngredient p")
public class ProductIngredient extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id", nullable=false)
	private Product product;

	//bi-directional many-to-one association to Ingredient
	@ManyToOne
	@JoinColumn(name="ingredient_id", nullable=false)
	private Ingredient ingredient;
}