package com.bilel.demo.controller;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.demo.modele.Produit;
import com.bilel.demo.service.ProduitService;

import lombok.AllArgsConstructor; 


@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    private final ProduitService produitService; 


    
    @PostMapping("/create")
    public Produit Create (@RequestBody Produit produit){
        return produitService.creer(produit) ; 
    }

    @GetMapping("/read")
    public List<Produit> read() {
        return produitService.Lire();
    }

    @PutMapping("/update/{id}") 
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id, produit) ; 
    }

    @DeleteMapping("/delete")
    public Produit delete(@PathVariable Long id){
        return produitService.supprimer(id); 
    }


}
