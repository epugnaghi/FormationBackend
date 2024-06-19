package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.domain.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository
{
    private static final Logger logger = LogManager.getLogger(MovieRepository.class);

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void persist(Movie movie)
    {
        entityManager.contains(movie);
        entityManager.persist(movie);
    }

    @Transactional
    public Movie find(Long id)
    {
        Movie result = entityManager.find(Movie.class, id);

        System.out.println("Contains : " + entityManager.contains(result));

        return result;
    }

    @Transactional
    public List<Movie> getAll()
    {
        return entityManager.createQuery("from Movie", Movie.class).getResultList();
    }
}
