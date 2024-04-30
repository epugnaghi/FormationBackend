package com.ep.controller;

import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerInvoiceWeb implements IControllerInvoice
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
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        invoiceService.createInvoice(invoice);
    }

}
