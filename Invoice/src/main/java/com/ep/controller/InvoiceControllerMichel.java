package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IInvoiceService;
import com.ep.service.InvoiceServiceMichel;

public class InvoiceControllerMichel implements IInvoiceController
{
    private IInvoiceService invoiceService = null;

    public void createInvoice()
    {
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        //IInvoiceService invoiceService = null;
        invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }

}
