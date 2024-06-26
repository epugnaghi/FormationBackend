package com.ep.Hibernate4All.service;

import com.ep.Hibernate4All.domain.Movie;
import com.ep.Hibernate4All.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService
{
    @Autowired
    private MovieRepository repository;

    @Transactional
    public void updateDescription(Long id, String description)
    {
        Movie movie = repository.find(id);
        movie.setDescription(description);
    }

    public Movie create(Movie movie)
    {
        repository.persist(movie);

        return movie;
    }

    public Movie get(Long id)
    {
        return repository.find(id);
    }

    public Optional<Movie> update(Movie movie)
    {
        return repository.update(movie);
    }

    public boolean remove(Long id)
    {
        return repository.remove(id);
    }
}
