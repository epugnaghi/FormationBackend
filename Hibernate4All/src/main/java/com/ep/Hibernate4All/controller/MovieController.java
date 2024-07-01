package com.ep.Hibernate4All.controller;

import com.ep.Hibernate4All.domain.Movie;
import com.ep.Hibernate4All.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class MovieController
{
//    @Autowired
//    private MovieRepository repository;

    @Autowired
    private MovieService service;


    @PostMapping("/")
    public Movie create(@RequestBody Movie movie)
    {
//        repository.persist(movie);
//        return movie;
        return service.create(movie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> get(@PathVariable("id") Long id)
    {
        Movie movie = service.get(id);

//        Movie movie = (Movie) Hibernate.unproxy(proxy);//service.get(id);

        if (movie != null)
            return ResponseEntity.ok(movie);
        else
            return ResponseEntity.notFound().build();
    }

    @PutMapping("/")
    public ResponseEntity<Movie> update(@RequestBody Movie movie)
    {
        Optional<Movie> result = service.update(movie);

        if (result.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(result.get());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Movie> delete(@PathVariable("id") Long id)
    {
        boolean removed = service.remove(id);

        return removed ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();

    }
}
