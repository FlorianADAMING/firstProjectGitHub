package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "prod")
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String code;
	private String description;
	
	@ManyToOne
	private Utilisateur utilisateur;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(Long idProduit, String code, String description) {
		super();
		this.idProduit = idProduit;
		this.code = code;
		this.description = description;
	}

	public Produit(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", description=" + description + "]";
	}

}
