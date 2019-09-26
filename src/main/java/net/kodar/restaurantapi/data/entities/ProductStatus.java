package net.kodar.restaurantapi.data.entities;


import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="product_status")
@NamedQuery(name="ProductStatus.findAll", query="SELECT p FROM ProductStatus p")
public class ProductStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;
}