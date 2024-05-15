package com.ep.InvoiceWeb.controller;

import com.ep.controller.IControllerInvoice;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/invoice")
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

    @PostMapping()
    public String createInvoice(@ModelAttribute("form") Invoice invoice)
    {
        //String name = "lukas";

        //Invoice invoice = new Invoice();
        //invoice.setCustomerName("Web-" + name);

        invoiceService.createInvoice(invoice);

        return "invoice-created";
    }

    @GetMapping("/home")
    public String displayHome(Model model)
    {
        System.out.println("la methode display home de controllerinvoiceweb");

        model.addAttribute("invoices", invoiceService.getInvoiceList());

        return "invoice-home";
    }

    @GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model)
    {
        System.out.println("la methode display invoice de controllerinvoiceweb");

        model.addAttribute("invoice", invoiceService.getInvoiceByNumber(number));

        return "invoice-details";
    }

    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute("form") Invoice invoice)
    {
        return "invoice-create-form";
    }
}
