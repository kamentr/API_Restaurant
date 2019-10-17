package net.kodar.restaurantapi.presentation.param;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;



@Data
@EqualsAndHashCode(callSuper=true)
public class MeasureParam extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="measure_unit", nullable=false, length=100)
	private String measureUnit;
}