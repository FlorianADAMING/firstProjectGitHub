package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ProduitBio")
public class ProduitBio extends Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String origine;

	public ProduitBio() {
		super();
	}

	public ProduitBio(String origine) {
		super();
		this.origine = origine;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	@Override
	public String toString() {
		return "ProduitBio [origine=" + origine + "]";
	}
	
	

}
