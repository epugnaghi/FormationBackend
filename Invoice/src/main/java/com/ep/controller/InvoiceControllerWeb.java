package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IInvoiceService;

public class InvoiceControllerWeb implements IInvoiceController
{
    private IInvoiceService invoiceService = null;

    public IInvoiceService getInvoiceService()
    {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService)
    {
        this.invoiceService = invoiceService;
    }


    public void createInvoice()
    {
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        //IInvoiceService invoiceService = null;
        //invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }

}
