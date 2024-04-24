package com.ep;

import com.ep.controller.ControllerInvoiceConsole;
import com.ep.controller.ControllerInvoiceWeb;
import com.ep.controller.IControllerInvoice;
import com.ep.dao.DaoInvoiceDB;
import com.ep.dao.DaoInvoiceMemory;
import com.ep.dao.IDaoInvoice;
import com.ep.service.IServiceInvoice;
import com.ep.service.ServiceInvoiceNumber;
import com.ep.service.ServiceInvoicePrefix;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Num Config : ");
        Scanner sc = new Scanner(System.in);
        int config = sc.nextInt();

        if (config == 1)
        {
            IControllerInvoice invoiceController = new ControllerInvoiceConsole();
            IServiceInvoice invoiceService = new ServiceInvoiceNumber();
            IDaoInvoice invoiceDao = new DaoInvoiceMemory();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
        else if (config == 2)
        {
            IControllerInvoice invoiceController = new ControllerInvoiceWeb();
            IServiceInvoice invoiceService = new ServiceInvoicePrefix();
            IDaoInvoice invoiceDao = new DaoInvoiceDB();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
    }
}
