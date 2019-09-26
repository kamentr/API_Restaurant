package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.data.entities.NamedPersistent;
import net.kodar.restaurantapi.data.entities.Persistent;
import net.kodar.restaurantapi.data.entities.Product;


@Data
@EqualsAndHashCode(callSuper=true)
public class ProductIngredientParam extends NamedPersistent implements Serializable {
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