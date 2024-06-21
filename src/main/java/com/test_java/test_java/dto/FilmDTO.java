package com.test_java.test_java.dto;

import lombok.Data;
import java.util.List;

/**
 * DTO utilisé pour transporter les informations d'un film entre les différentes
 * couches de l'application.
 * Utilise l'annotation @Data de Lombok pour générer les méthodes equals,
 * hashCode, toString, getters et setters.
 */
@Data
public class FilmDTO {
    private Long id;
    private String titre;
    private String description;
    private List<ActeurDTO> acteurs;
}
