package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="p_alimentaire")
@DiscriminatorValue(value="alimentaire")
public class ProduitAlimentaire extends Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nature;
	public ProduitAlimentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProduitAlimentaire(String nature) {
		super();
		this.nature = nature;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	

}
