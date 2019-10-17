package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;

@Data
@EqualsAndHashCode(callSuper=true)
public class IngredientStatusParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;
}