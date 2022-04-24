package com.example.Demo.service;

import com.example.Demo.entities.Livre;
import com.example.Demo.repos.LivreRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.OrderBy;
import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepos livreRepos;

    //@OrderBy("id DESC")
    public List<Livre> getAllLivres(){
      return livreRepos.findAll();
    };

    public Livre getLivreById(Long id){
        return livreRepos.findById(id).get();
    };

    public void saveLivre(Livre l){
        livreRepos.save(l);
    }

    public void deleteLivre(Livre l){
        livreRepos.delete(l);
    }
    public void removeLivreById(Long id) {
    	livreRepos.deleteById(id);
    }
    
}
