package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private List<Film> films = new ArrayList<>(List.of(
            new Film(1, "Tenet",      "Harry Ford", 2024),
            new Film(2, "The Mask",    "Jim Nolan",    2001),
            new Film(3, "La vita è bella", "Roberto Benigni",      1997)
    ));
    private int nextId = 4;

    @GetMapping
    public List<Film> getAll() {
        return films;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getById(@PathVariable int id) {
        return films.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Film> create(@RequestBody Film film) {
        film.setId(nextId++);
        films.add(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(film);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Film> update(@PathVariable int id, @RequestBody Film aggiornato) {
        for (Film f : films) {
            if (f.getId() == id) {
                f.setTitolo(aggiornato.getTitolo());
                f.setRegista(aggiornato.getRegista());
                f.setAnno(aggiornato.getAnno());
                return ResponseEntity.ok(f);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        boolean rimosso = films.removeIf(f -> f.getId() == id);
        return rimosso
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}