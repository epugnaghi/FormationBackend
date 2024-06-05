package com.ep;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories
public class AppInvoiceWeb
{
    /*dans rep ep car il va parser à la recherche de bean dans le rep ep du projet invoice*/
    public static void main(String[] args)
    {
        SpringApplication.run(AppInvoiceWeb.class, args);
    }
}
