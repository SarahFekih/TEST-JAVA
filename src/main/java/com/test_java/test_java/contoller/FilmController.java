package com.test_java.test_java.contoller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test_java.test_java.dto.FilmDTO;
import com.test_java.test_java.entity.Film;
import com.test_java.test_java.repository.FilmRepository;
import com.test_java.test_java.service.FilmService;

/**
 * Contrôleur REST pour gérer les opérations liées aux films.
 * 
 * @author Sarra
 */
@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmService filmService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Endpoint GET pour récupérer un film par son ID.
     *
     * @param id L'ID du film à récupérer.
     * @return ResponseEntity contenant le film trouvé ou une réponse NotFound.
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id)
                .map(film -> ResponseEntity.ok(modelMapper.map(film, FilmDTO.class)))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Endpoint POST pour ajouter un nouveau film.
     *
     * @param filmDTO Les données du film à ajouter.
     * @return ResponseEntity avec le DTO du film ajouté et le statut HttpStatus.CREATED.
     */
    @PostMapping
    public ResponseEntity<FilmDTO> addFilm(@RequestBody FilmDTO filmDTO) {

        Film film = modelMapper.map(filmDTO, Film.class);
        Film savedFilm = filmRepository.save(film);
        FilmDTO savedFilmDTO = modelMapper.map(savedFilm, FilmDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFilmDTO);
    }
}
