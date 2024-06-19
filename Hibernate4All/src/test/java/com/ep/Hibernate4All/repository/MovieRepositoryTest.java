package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.config.PersistenceConfig;
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
@ContextConfiguration(classes = {PersistenceConfig.class})
@SqlConfig(dataSource = "dataSourceH2", transactionManager = "transactionManager")
@Sql({"/data/data-test.sql"})
public class MovieRepositoryTest
{
    private static final Logger logger = LoggerFactory.getLogger(MovieRepository.class);

    @Autowired
    private MovieRepository repository;

    @Test
    public void save_casNominal()
    {
        logger.debug("MovieRepositoryTest/save_casNominal");


        Movie movie = new Movie();
        movie.setName("inception");

        repository.persist(movie);
    }

    @Test
    public void find_casNominal()
    {
        Movie movie = repository.find(-2L);

        logger.debug("Name : {}", movie.getName());
    }

    @Test
    public void findAll_casNominal()
    {
        List<Movie> list = repository.getAll();

        if(list != null)
        {
            logger.debug("Stream : ");
            list.forEach((movie) -> logger.debug("Name : {}", movie.getName()));

            logger.debug("Classic : ");
            for (Movie movie : list) {
                logger.debug("Name : {}", movie.getName());
            }
        }
    }
}
