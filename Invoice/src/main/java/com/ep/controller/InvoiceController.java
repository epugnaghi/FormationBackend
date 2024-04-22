package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController
{
    public void createInvoiceControllerUsingConsole()
    {
        System.out.println("Name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        InvoiceService invoiceService = null;
        invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }

}
