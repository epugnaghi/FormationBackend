package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.domain.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class MovieRepository
{
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void persist(Movie movie)
    {
        entityManager.contains(movie);
        entityManager.persist(movie);
    }

    public Movie find(Long id)
    {
        return entityManager.find(Movie.class, id);
    }

    public List<Movie> getAll()
    {
        throw new UnsupportedOperationException();
    }
}
