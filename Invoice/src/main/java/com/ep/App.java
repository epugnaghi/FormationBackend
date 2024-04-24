package com.ep;

import com.ep.controller.IControllerInvoice;
import com.ep.dao.IDaoInvoice;
import com.ep.service.IServiceInvoice;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Num Config : ");
        Scanner sc = new Scanner(System.in);
        int config = sc.nextInt();

        String controllerClassName;
        String serviceClassName;
        String daoClassName;
        IControllerInvoice invoiceController = null;
        IServiceInvoice invoiceService = null;
        IDaoInvoice invoiceDao = null;

        if (config == 1)
        {
            controllerClassName = "com.ep.controller.ControllerInvoiceConsole";
            serviceClassName = "com.ep.service.ServiceInvoiceNumber";
            daoClassName = "com.ep.dao.DaoInvoiceMemory";
        }
        else if (config == 2)
        {
            controllerClassName = "com.ep.controller.ControllerInvoiceWeb";
            serviceClassName = "com.ep.service.ServiceInvoicePrefix";
            daoClassName = "com.ep.dao.DaoInvoiceDB";
        }
        else
        {
            controllerClassName = "com.ep.controller.ControllerInvoiceConsole";
            serviceClassName = "com.ep.service.ServiceInvoiceNumber";
            daoClassName = "com.ep.dao.DaoInvoiceMemory";
        }


        try
        {
            invoiceController = (IControllerInvoice) Class.forName(controllerClassName).getDeclaredConstructor().newInstance();
            invoiceService = (IServiceInvoice) Class.forName(serviceClassName).getDeclaredConstructor().newInstance();
            invoiceDao = (IDaoInvoice) Class.forName(daoClassName).getDeclaredConstructor().newInstance();
        }
        catch (Exception e)
        {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        if (invoiceController != null)
            invoiceController.setInvoiceService(invoiceService);

        if (invoiceService != null)
            invoiceService.setInvoiceDao(invoiceDao);

        if (invoiceController != null)
            invoiceController.createInvoice();
    }
}
