package com.example.Demo.controller;

import com.example.Demo.entities.Livre;
import com.example.Demo.repos.LivreRepos;
import com.example.Demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/emsi_api")
public class LivreController {

    @Autowired
    private LivreService livreService;

    // GET http://localhost:8080/emsi_api/livres
    @GetMapping("/livres")
    public List<Livre> findAllLivres(){
        return livreService.getAllLivres();
    }

    // GET http://localhost:8080/emsi_api/livres/{id}
    @GetMapping("/livres/{id}")
    public Livre findLivreById(@PathVariable Long id){
        return livreService.getLivreById(id);
    }
    @PutMapping("/livres/{id}")
    public String updateLivre(@PathVariable Long id, @RequestBody Livre livreupdate){
        Livre livre = livreService.getLivreById(id);
        livre.setTitre(livreupdate.getTitre());
        livre.setMaisonEdition(livreupdate.getMaisonEdition());
        livre.setAuteur(livreupdate.getAuteur());
        livre.setDisponible(livreupdate.getDisponible());
        livre.setDateDerniereConsultation(livreupdate.getDateDerniereConsultation());
        livre.setDateSortie(livreupdate.getDateSortie());
        livre.setISBN(livre.getISBN());
        livre.setNombrePage(livreupdate.getNombrePage());

        livreService.saveLivre(livre);
        return "Mis à jour avec succes";
    }
    @DeleteMapping("/livres/{id}")
    public String removeLivre(@PathVariable Long id){
        livreService.removeLivreById(id);

        return "Supression avec succes";
    }
}
