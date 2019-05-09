package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Produit;

@Repository
public interface ProduitBioRepository extends JpaRepository<Produit, Long> {

}
