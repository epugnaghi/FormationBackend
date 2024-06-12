package com.ep.controller.keyboard;

import com.ep.controller.IControllerInvoice;
import com.ep.entity.Customer;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;

import java.util.Scanner;

public class InvoiceControllerKeyboard implements IControllerInvoice
{
    private IServiceInvoice invoiceService;

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }

    public void setInvoiceService(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }

    @Override
    public String createInvoice(Invoice invoice)
    {
        System.out.println("Customer name ?");
        Scanner sc = new Scanner((System.in));
        String customerName = sc.nextLine();

        invoice = new Invoice();
        Customer customer = new Customer(customerName);

        invoice.setCustomer(customer);

        return null;
    }
}
