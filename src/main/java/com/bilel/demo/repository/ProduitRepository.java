package com.bilel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilel.demo.modele.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {




}
