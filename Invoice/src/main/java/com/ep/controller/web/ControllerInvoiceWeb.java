package com.ep.controller.web;

import com.ep.controller.IControllerInvoice;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerInvoiceWeb implements IControllerInvoice
{
    private final IServiceInvoice invoiceService;

    public ControllerInvoiceWeb(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }

    public void createInvoice()
    {
        String name = "lukas";

        Invoice invoice = new Invoice();
        invoice.setCustomerName("Web-" + name);

        invoiceService.createInvoice(invoice);
    }

}
