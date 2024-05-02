package com.ep;

import com.ep.controller.IControllerInvoice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.ep.controller.console", "com.ep.service.prefix", "com.ep.repository.memory"})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App
{
    public static void main(String[] args)
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        IControllerInvoice invoiceController = context.getBean(IControllerInvoice.class);

        invoiceController.createInvoice();
    }

    /*
    @Bean
    public IServiceInvoice configServiceInvoice()
    {
        return new ServiceInvoicePrefix();
    }
    */
}
