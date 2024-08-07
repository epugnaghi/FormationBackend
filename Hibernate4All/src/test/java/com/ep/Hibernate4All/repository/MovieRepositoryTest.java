package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.config.PersistenceConfigTest;
import com.ep.Hibernate4All.domain.Certification;
import com.ep.Hibernate4All.domain.Movie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {PersistenceConfigTest.class})
@SqlConfig(dataSource = "dataSourceH2", transactionManager = "transactionManager")
@Sql({"/data/data-test.sql"})
public class MovieRepositoryTest
{
    private static final Logger logger = LoggerFactory.getLogger(MovieRepository.class);

    @Autowired
    private MovieRepository repository;

    @Test
    public void testSuite()
    {
        testSave();
        testFind();
        testFindAll();
        testMerge();
        testRemove();
        testReference();
        testReference2();
        testFlush();
    }

    //    @Test
    public void testSave()
    {
        logger.warn("TEST : SAVE");


        Movie movie = new Movie();
        movie.setName("inception");
        movie.setCertification(Certification.NOT_UNDER_16);

        repository.persist(movie);
    }

    //    @Test
    public void testFind()
    {
        logger.warn("TEST : FIND");

        Movie movie = repository.find(-2L);

        logger.warn("Name : {}", movie.getName());
        logger.warn("Certification : {}", movie.getCertification());
    }

    //    @Test
    public void testFindAll()
    {
        logger.warn("TEST : FIND ALL");

        List<Movie> list = repository.getAll();

        if (list != null)
        {
            //logger.warn("Stream : ");
            list.forEach((movie) -> logger.warn("Name : {}", movie.getName()));

//            logger.warn("Classic : ");
//            for (Movie movie : list) {
//                logger.warn("Name : {}", movie.getName());
//            }
        }
    }

    //    @Test
    public void testMerge()
    {
        logger.warn("TEST : MERGE");

        Movie movie = new Movie();
        movie.setName("inception2");
        movie.setId(-1L);

        Movie movieMerge = new Movie();
        movieMerge = repository.merge(movie);

        assert movieMerge.getName().compareTo("inception2") == 0;
    }

    public void testRemove()
    {
        logger.warn("TEST : REMOVE");

        repository.remove(-2L);
    }

    public void testReference()
    {
        logger.warn("TEST : GET REFERENCE");

        Movie movie = repository.getReference(-1L);

        logger.warn("movie : " + movie.getName());
    }

    public void testReference2()
    {
        logger.warn("TEST : GET REFERENCE 2");

        Movie movie = repository.getReference(-1L);

        logger.warn("movie : " + movie.getName());
    }

    public void testFlush()
    {
        logger.warn("TEST : FLUSH");


        Movie movie = new Movie();
        movie.setName("inception2");

        repository.flush(movie);
    }
}
