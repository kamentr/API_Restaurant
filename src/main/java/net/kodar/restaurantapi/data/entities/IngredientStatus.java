package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="ingredient_status")
@NamedQuery(name="IngredientStatus.findAll", query="SELECT i FROM IngredientStatus i")
public class IngredientStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;
}