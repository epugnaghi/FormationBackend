package com.ep;

import com.ep.controller.IInvoiceController;
import com.ep.controller.InvoiceControllerConsole;
import com.ep.controller.InvoiceControllerWeb;
import com.ep.dao.IInvoiceDao;
import com.ep.dao.InvoiceDaoDB;
import com.ep.dao.InvoiceDaoMemory;
import com.ep.service.IInvoiceService;
import com.ep.service.InvoiceServiceINV_Number;
import com.ep.service.InvoiceServiceNumber;

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
            IInvoiceController invoiceController = new InvoiceControllerConsole();
            IInvoiceService invoiceService = new InvoiceServiceNumber();
            IInvoiceDao invoiceDao = new InvoiceDaoMemory();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
        else if (config == 2)
        {
            IInvoiceController invoiceController = new InvoiceControllerWeb();
            IInvoiceService invoiceService = new InvoiceServiceINV_Number();
            IInvoiceDao invoiceDao = new InvoiceDaoDB();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
    }
}
