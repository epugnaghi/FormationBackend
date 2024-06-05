package com.ep.api;

import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceResource //implements IControllerInvoice
{
    private final IServiceInvoice invoiceService;

    public InvoiceResource(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }


    @PostMapping()
    public Invoice create(@RequestBody Invoice invoice)
    {
        return invoiceService.createInvoice(invoice);
    }


    @GetMapping
    public Iterable<Invoice> list()
    {
        System.out.println("la methode display home de controllerinvoiceweb");

        return invoiceService.getInvoiceList();
    }

    @GetMapping("/{id}")
    public Invoice get(@PathVariable("id") String number)
    {
        System.out.println("la methode display invoice de controllerinvoiceweb");

        return invoiceService.getInvoiceByNumber(number);
    }
}
