package com.example.Demo.repos;

import com.example.Demo.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LivreRepos extends JpaRepository<Livre, Long> {
}
