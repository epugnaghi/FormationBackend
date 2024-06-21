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

        entityManager.merge(movie);

        Movie movie2 = entityManager.find(Movie.class, movie.getId());
        return movie2;
    }

    @Transactional
    public Movie merge2(Movie movie)
    {
        logger.warn("MovieRepository-merge");

        Movie movie2 = entityManager.find(Movie.class, movie.getId());
        return entityManager.merge(movie);
    }

    @Transactional
    public void remove(Long id)
    {
        logger.warn("MovieRepository-remove");
        Movie movie = entityManager.find(Movie.class, id);

        Movie movie2 = entityManager.find(Movie.class, id);
        Movie movie3 = entityManager.find(Movie.class, id);

        entityManager.remove(movie);
    }

    @Transactional
    public Movie getReference(Long id)
    {
        logger.warn("MovieRepository-getReference");

        Movie movie = null;
        movie = entityManager.getReference(Movie.class, id);

        if (movie != null)
            logger.warn("Movie : " + movie.getName());

        return movie;
    }

    @Transactional
    public void flush(Movie movie)
    {
        logger.warn("MovieRepository-flush");

        entityManager.persist(movie);
        entityManager.flush();

    }
}
