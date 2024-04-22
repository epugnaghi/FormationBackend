package com.ep;

import com.ep.controller.InvoiceController;
import com.ep.controller.InvoiceControllerMichel;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Num Config : ");
        Scanner sc = new Scanner(System.in);
        int config = sc.nextInt();

        if (config == 1)
        {
            InvoiceController invoiceController = new InvoiceController();

            invoiceController.createInvoiceControllerUsingConsole();
        } else if (config == 2)
        {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();

            invoiceControllerMichel.createInvoiceControllerUsingWebUI();
        }
    }
}
