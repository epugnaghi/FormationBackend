package com.ep.repository.db;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class RepositoryInvoiceDB implements IRepositoryInvoice
{
    private static final List<Invoice> listInvoice = new ArrayList<>();

    public void create(Invoice invoice)
    {
        listInvoice.add(invoice);
        System.out.println("DB-invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list()
    {
        return null;
    }
}
