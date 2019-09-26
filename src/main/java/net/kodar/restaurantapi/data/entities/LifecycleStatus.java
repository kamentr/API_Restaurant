package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="lifecycle_status")
@NamedQuery(name="LifecycleStatus.findAll", query="SELECT l FROM LifecycleStatus l")
public class LifecycleStatus extends NamedPersistent  implements Serializable {
	private static final long serialVersionUID = 1L;

}