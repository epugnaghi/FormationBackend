package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IInvoiceService;
import com.ep.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController implements IInvoiceController
{
    private IInvoiceService invoiceService = null;

    public void createInvoice()
    {
        System.out.println("Name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        //IInvoiceService invoiceService = null;
        invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }

}
