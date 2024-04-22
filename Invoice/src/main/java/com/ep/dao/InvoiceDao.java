package com.ep.dao;

import com.ep.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDao
{
    private static final List<Invoice> listInvoice = new ArrayList<Invoice>();

    public void create(Invoice invoice)
    {
        listInvoice.add(invoice);
        System.out.println("invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

}
