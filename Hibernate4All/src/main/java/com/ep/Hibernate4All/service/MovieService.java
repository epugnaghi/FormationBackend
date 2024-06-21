package com.ep.Hibernate4All.service;

import com.ep.Hibernate4All.domain.Movie;
import com.ep.Hibernate4All.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
