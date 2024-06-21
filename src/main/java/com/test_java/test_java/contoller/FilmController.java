package com.test_java.test_java.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test_java.test_java.dto.FilmDTO;
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
    private FilmService filmService;

    /**
     * Endpoint GET pour récupérer un film par son ID.
     *
     * @param id L'ID du film à récupérer.
     * @return ResponseEntity contenant le film trouvé ou une réponse NotFound.
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Endpoint POST pour ajouter un nouveau film.
     *
     * @param filmDTO Les données du film à ajouter.
     * @return ResponseEntity avec le DTO du film ajouté et le statut
     *         HttpStatus.CREATED.
     */
    @PostMapping
    public ResponseEntity<?> addFilm(@RequestBody FilmDTO filmDTO) {
        try {
            FilmDTO savedFilmDTO = filmService.addFilm(filmDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedFilmDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erreur lors de l'ajout du film : " + e.getMessage());
        }
    }

}
