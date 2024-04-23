package com.ep;

import com.ep.controller.IInvoiceController;
import com.ep.controller.InvoiceController;
import com.ep.controller.InvoiceControllerMichel;
import com.ep.dao.IInvoiceDao;
import com.ep.dao.InvoiceDao;
import com.ep.dao.InvoiceDaoMichel;
import com.ep.service.IInvoiceService;
import com.ep.service.InvoiceService;
import com.ep.service.InvoiceServiceMichel;

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
            IInvoiceController invoiceController = new InvoiceController();
            IInvoiceService invoiceService = new InvoiceService();
            IInvoiceDao invoiceDao = new InvoiceDao();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
        else if (config == 2)
        {
            IInvoiceController invoiceController = new InvoiceControllerMichel();
            IInvoiceService invoiceService = new InvoiceServiceMichel();
            IInvoiceDao invoiceDao = new InvoiceDaoMichel();

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceDao(invoiceDao);
            invoiceController.createInvoice();
        }
    }
}
