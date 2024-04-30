package com.ep.dao;

import com.ep.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoInvoiceMemory implements IDaoInvoice
{
    private static final List<Invoice> listInvoice = new ArrayList<>();

    public void create(Invoice invoice)
    {
        listInvoice.add(invoice);
        System.out.println("invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
