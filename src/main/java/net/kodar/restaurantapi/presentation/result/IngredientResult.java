package net.kodar.restaurantapi.presentation.result;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


/**
 * The persistent class for the ingredient database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class IngredientResult extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to IngredientStatus
	@ManyToOne
	@JoinColumn(name="ingredient_status_id", nullable=false)
	private IngredientStatus ingredientStatus;
}