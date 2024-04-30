package com.ep.controller.console;

import com.ep.controller.IControllerInvoice;
import com.ep.entity.Invoice;
import com.ep.service.IServiceInvoice;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ControllerInvoiceConsole implements IControllerInvoice
{
    private final IServiceInvoice invoiceService;

    public ControllerInvoiceConsole(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }

    public IServiceInvoice getInvoiceService()
    {
        return invoiceService;
    }

    /*@Autowired
    public void setInvoiceService(IServiceInvoice invoiceService)
    {
        this.invoiceService = invoiceService;
    }
    */

    public void createInvoice()
    {
        System.out.println("Console-" + "Name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        invoiceService.createInvoice(invoice);
    }

}
