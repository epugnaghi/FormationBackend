package com.ep.InvoiceWeb.controller;

import com.ep.InvoiceWeb.form.InvoiceForm;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class ControllerInvoiceWeb //implements IControllerInvoice
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


    @PostMapping("/create")
    public String createInvoice(@Valid @ModelAttribute("form") InvoiceForm invoiceForm, BindingResult result)
    {
        if (result.hasErrors())
        {
            return "invoice-create-form";
        }

        Invoice invoice = new Invoice();
        invoice.setOrderNumber(invoiceForm.getOrderNumber());
        invoice.setCustomerName(invoiceForm.getCustomerName());

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

    /*
    @GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model)
    {
        System.out.println("la methode display invoice de controllerinvoiceweb");

        model.addAttribute("invoice", invoiceService.getInvoiceByNumber(number));

        return "invoice-details";
    }

     */

    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute("form") InvoiceForm invoice)
    {
        return "invoice-create-form";
    }
}
