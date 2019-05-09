package com.adaming.entities;

<<<<<<< HEAD
=======
import java.io.Serializable;

>>>>>>> b71e725f7815f30feefe10949d7c09c5fa8a925e
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
<<<<<<< HEAD
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
=======
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
	
	
>>>>>>> b71e725f7815f30feefe10949d7c09c5fa8a925e

}
