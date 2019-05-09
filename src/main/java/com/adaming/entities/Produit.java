package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.InheritanceType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;


@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")


public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idUtilisateur;
	private Long code;
	private String description;
	
	@ManyToOne
	private Utilisateur u;

	public Produit() {
		super();
	}

	public Produit(Long code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public Produit(Long code, String description, Utilisateur u) {
		super();
		this.code = code;
		this.description = description;
		this.u = u;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Utilisateur getU() {
		return u;
	}

	public void setU(Utilisateur u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "Produit [idUtilisateur=" + idUtilisateur + ", code=" + code + ", description=" + description + ", u="
				+ u + "]";
	}
	
	
	
	

}
