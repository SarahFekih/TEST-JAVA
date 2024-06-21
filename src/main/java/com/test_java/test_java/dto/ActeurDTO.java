package com.test_java.test_java.dto;

import lombok.Data;

/**
 * DTO utilisé pour transporter les informations d'un acteur entre les
 * différentes couches de l'application.
 * Utilise l'annotation @Data de Lombok pour générer les méthodes equals,
 * hashCode, toString, getters et setters.
 */
@Data
public class ActeurDTO {
    private Long id;
    private String nom;
    private String prenom;
}