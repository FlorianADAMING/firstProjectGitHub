package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
<<<<<<< HEAD

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


=======
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
>>>>>>> c987f8555f134a566e296ced9919188095ef25c8
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	
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
=======
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
>>>>>>> c987f8555f134a566e296ced9919188095ef25c8
		this.code = code;
		this.description = description;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> c987f8555f134a566e296ced9919188095ef25c8
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

<<<<<<< HEAD
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
	
	
	
	
=======
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", description=" + description + "]";
	}
>>>>>>> c987f8555f134a566e296ced9919188095ef25c8

}
