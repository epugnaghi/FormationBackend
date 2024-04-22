package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.InvoiceServiceMichel;

public class InvoiceControllerMichel
{
    public void createInvoiceControllerUsingWebUI()
    {
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        InvoiceServiceMichel invoiceService = null;
        invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }

}
