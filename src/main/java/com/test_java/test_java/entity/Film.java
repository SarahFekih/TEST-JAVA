package com.test_java.test_java.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entité JPA représentant un film dans la base de données.
 */
@Entity
@Data
@NoArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "acteur_id"))
    private List<Acteur> acteurs; // Liste des acteurs jouant dans ce film

    // Constructeur par défaut généré par Lombok

    // Getters et setters générés par Lombok

}
