package com.ep.Hibernate4All.service;

import com.ep.Hibernate4All.config.PersistenceConfigTest;
import com.ep.Hibernate4All.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {PersistenceConfigTest.class})
@SqlConfig(dataSource = "dataSourceH2", transactionManager = "transactionManager")
@Sql({"/data/data-test.sql"})
public class MovieServiceTest
{
    private static final Logger logger = LoggerFactory.getLogger(MovieRepository.class);

    @Autowired
    private MovieService service;

    @Test
    public void testSuite()
    {
        testUpdate();
    }

    public void testUpdate()
    {
        logger.warn("TEST : UPDATE");

        service.updateDescription(-1L, "Super film");

//        logger.warn("Name : {}", movie.getName());
    }
}
