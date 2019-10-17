package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="measure")
@NamedQuery(name="Measure.findAll", query="SELECT m FROM Measure m")
public class Measure extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="measure_unit", nullable=false, length=100)
	private String measureUnit;
}