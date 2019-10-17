package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="api_user_status")
@NamedQuery(name="ApiUserStatus.findAll", query="SELECT a FROM ApiUserStatus a")
public class ApiUserStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}