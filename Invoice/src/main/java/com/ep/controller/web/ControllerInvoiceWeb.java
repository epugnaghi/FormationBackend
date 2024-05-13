package com.ep.controller.web;

import com.ep.controller.IControllerInvoice;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices") List<Invoice> displayHome()
    {
        System.out.println("la methode display home de controllerinvoiceweb");

        List<Invoice> list = invoiceService.getInvoiceList();

        return list;
    }
}
