package com.bilel.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bilel.demo.modele.Produit;
import com.bilel.demo.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository ; 

    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> Lire() {
        return produitRepository.findAll();

    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findBy(id)
            .map(p->{
                p.setPrix(produit.getPrix()); 
                p.setNom(produit.getNom());
                p.setDescription(produit.getDescription()); 
                return produitRepository.save(p);

            }).orElseThrow(()  -> new RuntimeException("Produit non trouver ! " ) ) ;
    }

    @Override
    public String supprimer(Long id) {
            produitRepository.deleteById(id);
            return "Produit Supprime ! " ; 

    }




}
