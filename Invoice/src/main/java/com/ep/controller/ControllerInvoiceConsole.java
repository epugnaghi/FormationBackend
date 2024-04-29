package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ControllerInvoiceConsole implements IControllerInvoice
{
    @Autowired
    private IServiceInvoice invoiceService = null;

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }

    @Autowired
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
