package com.test_java.test_java.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test_java.test_java.entity.Film;
import com.test_java.test_java.repository.FilmRepository;

/**
 * Service qui gère la logique métier associée à l'entité Film.
 */
@Service
public class FilmService {

    /**
     * Retourne un film en fonction de son id.
     *
     * @param id L'identifiant du film à rechercher
     * @return Optional contenant le film trouvé, ou Optional vide si aucun film correspondant n'est trouvé
     */
    @Autowired
    private FilmRepository filmRepository; // Repository permettant d'accéder aux données des films

    public  Optional<Film> getFilmById(Long id){
        return filmRepository.findById(id);
    }

    
}