package com.ep;

import com.ep.controller.IInvoiceController;
import com.ep.controller.InvoiceController;
import com.ep.controller.InvoiceControllerMichel;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Num Config : ");
        Scanner sc = new Scanner(System.in);
        int config = sc.nextInt();

        if (config == 1)
        {
            IInvoiceController invoiceController = new InvoiceController();

            invoiceController.createInvoice();
        } else if (config == 2)
        {
            IInvoiceController invoiceControllerMichel = new InvoiceControllerMichel();

            invoiceControllerMichel.createInvoice();
        }
    }
}
