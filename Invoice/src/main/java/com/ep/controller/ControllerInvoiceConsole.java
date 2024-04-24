package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;

import java.util.Scanner;

public class ControllerInvoiceConsole implements IControllerInvoice
{
    private IServiceInvoice invoiceService = null;

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }

    public void setInvoiceService(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }


    public void createInvoice()
    {
        System.out.println("Name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        //IInvoiceService invoiceService = null;
        //invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }

}
