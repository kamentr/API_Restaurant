package net.kodar.restaurantapi.data.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the ingredient database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="ingredient")
@NamedQuery(name="Ingredient.findAll", query="SELECT i FROM Ingredient i")
public class Ingredient extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to IngredientStatus
	@ManyToOne
	@JoinColumn(name="ingredient_status_id", nullable=false)
	private IngredientStatus ingredientStatus;
}