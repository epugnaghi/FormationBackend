package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.domain.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MovieRepository.class);

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void persist(Movie movie)
    {
        logger.warn("MovieRepository-persist");

        entityManager.persist(movie);
        logger.warn("persist-entityManager.contains : " + entityManager.contains(movie));

        //entityManager.detach(movie);
        //logger.warn("detach-persist-entityManager.contains : " + entityManager.contains(movie));
    }

    @Transactional
    public Movie find(Long id)
    {
        logger.warn("MovieRepository-find");
        Movie result = entityManager.find(Movie.class, id);

        logger.warn("find/entityManager.contains : " + entityManager.contains(result));

        return result;
    }

    @Transactional
    public List<Movie> getAll()
    {
        logger.warn("MovieRepository-getAll");
        return entityManager.createQuery("from Movie", Movie.class).getResultList();
    }

    @Transactional
    public Movie merge(Movie movie)
    {
        logger.warn("MovieRepository-merge");
        return entityManager.merge(movie);
    }
}
