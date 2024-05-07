package com.ep;

import com.ep.controller.IControllerInvoice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
//@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(App.class, args);
        IControllerInvoice invoiceController = context.getBean(IControllerInvoice.class);

        invoiceController.createInvoice();
    }
}
