package com.adaming.services;

import java.util.List;

import com.adaming.entities.ProduitAlimentaire;

public interface IProduitAlimentaireService {
	
	public List<ProduitAlimentaire> findAll();
	public ProduitAlimentaire findOne(ProduitAlimentaire prodAlim);
	

}
