package com.test_java.test_java.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test_java.test_java.entity.Film;

/**
 * Interface repository pour l'entité Film, permettant d'effectuer des opérations CRUD sur la table Film en base de données.
 * Utilise JpaRepository fourni par Spring Data JPA pour les opérations de base.
 */
public interface FilmRepository extends JpaRepository<Film, Long> {
}
