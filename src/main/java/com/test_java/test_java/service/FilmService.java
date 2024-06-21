package com.test_java.test_java.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test_java.test_java.dto.FilmDTO;
import com.test_java.test_java.entity.Film;
import com.test_java.test_java.repository.FilmRepository;

/**
 * Service qui gère la logique métier associée à l'entité Film.
 */
@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private ModelMapper modelMapper;

    /**
     * Retourne un film en fonction de son id.
     *
     * @param id L'identifiant du film à rechercher
     * @return Optional contenant le film trouvé, ou Optional vide si aucun film
     *         correspondant n'est trouvé
     */
    public Optional<FilmDTO> getFilmById(Long id) {
        Optional<Film> optionalFilm = filmRepository.findById(id);
        return optionalFilm.map(film -> modelMapper.map(film, FilmDTO.class));
    }

    /**
     * Enregistre un nouveau film dans la base de données.
     *
     * @param filmDTO Les données du film à ajouter.
     * @return Le DTO du film ajouté.
     */
    public FilmDTO addFilm(FilmDTO filmDTO) {
        // Convertir FilmDTO en Film avec ModelMapper
        Film film = modelMapper.map(filmDTO, Film.class);

        // Sauvegarder le film dans la base de données
        Film savedFilm = filmRepository.save(film);

        // Convertir le film sauvegardé en FilmDTO
        FilmDTO savedFilmDTO = modelMapper.map(savedFilm, FilmDTO.class);

        return savedFilmDTO;
    }

}