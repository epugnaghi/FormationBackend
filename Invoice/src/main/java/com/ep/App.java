package com.ep;

import com.ep.controller.IControllerInvoice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IControllerInvoice invoiceController = context.getBean(IControllerInvoice.class);

        if (invoiceController != null)
            invoiceController.createInvoice();
    }
}
