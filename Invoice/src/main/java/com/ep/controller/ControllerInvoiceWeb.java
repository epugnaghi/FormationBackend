package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;

public class ControllerInvoiceWeb implements IControllerInvoice
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
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        //IInvoiceService invoiceService = null;
        //invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }

}
