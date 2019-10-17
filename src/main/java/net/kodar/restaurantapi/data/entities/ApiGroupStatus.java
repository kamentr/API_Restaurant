package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the api_group_status database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="api_group_status")
@NamedQuery(name="ApiGroupStatus.findAll", query="SELECT a FROM ApiGroupStatus a")
public class ApiGroupStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}