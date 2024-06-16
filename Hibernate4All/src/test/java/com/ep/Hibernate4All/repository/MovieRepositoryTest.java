package com.ep.Hibernate4All.repository;

import com.ep.Hibernate4All.config.PersistenceConfig;
import com.ep.Hibernate4All.domain.Movie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {PersistenceConfig.class})
@SqlConfig(dataSource = "dataSourceH2", transactionManager = "transactionManager")
@Sql({"/data/data-test.sql"})
//@Sql(scripts={"classpath:data-test.sql"})
public class MovieRepositoryTest
{

    @Autowired
    private MovieRepository repository;

    @Test
    public void save_casNominal()
    {
        System.out.println("MovieRepositoryTest/save_casNominal");

        Movie movie = new Movie();
        movie.setName("inception");

        repository.persist(movie);

        System.out.println("MovieRepositoryTest/save_casNominal");
    }

    @Test
    public void find_casNominal()
    {
        Movie movie = repository.find(-2L);

        System.out.println("Name : " + movie.getName());
    }
}
