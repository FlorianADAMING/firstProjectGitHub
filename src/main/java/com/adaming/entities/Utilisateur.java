package com.adaming.entities;

<<<<<<< Updated upstream
import java.io.Serializable;
=======
>>>>>>> Stashed changes
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

<<<<<<< Updated upstream

@Entity
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Produit> produits = new HashSet<>();
	
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long idUtilisateur, String nom, String prenom, Set<Produit> produits) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.produits = produits;
	}

	public Utilisateur(String nom, String prenom, Set<Produit> produits) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.produits = produits;
	}

	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}	
	
=======
@Entity
public class Utilisateur {
>>>>>>> Stashed changes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;

	@OneToMany(mappedBy = "utilisateur")
	private Set<Produit> produits = new HashSet<Produit>();

	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur(Long idUtilisateur, String nom, String prenom) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
}
