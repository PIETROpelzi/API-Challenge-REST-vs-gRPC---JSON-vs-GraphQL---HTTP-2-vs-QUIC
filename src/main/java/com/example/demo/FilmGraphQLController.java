package com.example.demo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmGraphQLController {

    // Stessa lista in memoria del REST (qui duplicata per semplicità)
    private List<Film> films = new ArrayList<>(List.of(
            new Film(1, "Il Padrino",      "Francis Ford Coppola", 1972),
            new Film(2, "Interstellar",    "Christopher Nolan",    2014),
            new Film(3, "La vita è bella", "Roberto Benigni",      1997)
    ));

    @QueryMapping
    public List<Film> films() {
        return films;
    }

    @QueryMapping
    public Film film(@Argument int id) {
        return films.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
    }
}