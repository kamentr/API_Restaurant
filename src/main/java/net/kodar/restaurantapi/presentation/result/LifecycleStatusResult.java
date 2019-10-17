package net.kodar.restaurantapi.presentation.result;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.kodar.restaurantapi.data.entities.NamedPersistent;


@Data
@EqualsAndHashCode(callSuper=true)
public class LifecycleStatusResult extends NamedPersistent  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false)
	private byte locked;
}