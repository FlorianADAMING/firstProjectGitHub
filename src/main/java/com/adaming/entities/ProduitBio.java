package com.adaming.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="prodBio")
public class ProduitBio extends Produit {
private String origine;

public ProduitBio(String origine) {
	super();
	this.origine = origine;
}

public ProduitBio() {
	super();
}

public String getOrigine() {
	return origine;
}

public void setOrigine(String origine) {
	this.origine = origine;
}

}
