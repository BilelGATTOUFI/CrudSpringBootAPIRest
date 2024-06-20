package com.bilel.demo.service;

import java.util.List;

import com.bilel.demo.modele.Produit;

public interface ProduitService {


    Produit creer (Produit produit); 


    List<Produit>  Lire(); 

    Produit modifier (Long id, Produit produit); 

    Produit supprimer (Long id); 



}
