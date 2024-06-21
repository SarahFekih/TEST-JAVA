package com.test_java.test_java.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entité JPA représentant un acteur dans la base de données.
 */
@Entity
@Data
@NoArgsConstructor
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    @ManyToMany(mappedBy = "acteurs")
    private List<Film> films; // Liste des films dans lesquels cet acteur a joué


    // Constructeur par défaut généré par Lombok

    // Getters et setters générés par Lombok

    // Méthodes equals() et hashCode() générées par Lombok

    // Méthode toString() générée par Lombok

}
