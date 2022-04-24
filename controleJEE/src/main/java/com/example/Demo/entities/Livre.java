package com.example.Demo.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.util.Date;

@Entity @Table(name = "LIVRE")
@AllArgsConstructor @NoArgsConstructor @Data 
public class Livre {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@OrderBy
    private Long Id;
    @Column(length = 50,nullable=false) 
    private String Titre;
    @Column(nullable=false,updatable = false) 
    private String MaisonEdition;
    @Temporal(TemporalType.DATE)@Column(nullable=false)
    private Date DateSortie;
    @Column(nullable=false) 
    private String Auteur;
    @Column(nullable=false) 
    private double NombrePage;
    @Column(unique = true, updatable = false,nullable=false)
    private String ISBN;
    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp @Column(nullable=false)
    private Date DateDerniereConsultation;;
    @Column(name = "disponibilité",nullable=false)
    private Boolean disponible;
}
