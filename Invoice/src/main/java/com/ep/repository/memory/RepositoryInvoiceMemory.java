package com.ep.repository.memory;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class RepositoryInvoiceMemory implements IRepositoryInvoice
{
    private static final List<Invoice> listInvoice = new ArrayList<>();

    public Invoice create(Invoice invoice)
    {
        listInvoice.add(invoice);
        System.out.println("Memory-invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());

        return invoice;
    }

    @Override
    public List<Invoice> list()
    {
        List<Invoice> result = new ArrayList<>();
        Invoice invoice = null;

        invoice = new Invoice();
        invoice.setNumber("num_1973");
        invoice.setCustomerName("etienne");
        result.add(invoice);

        invoice = new Invoice();
        invoice.setNumber("num_1979");
        invoice.setCustomerName("christelle");
        result.add(invoice);

        invoice = new Invoice();
        invoice.setNumber("num_2006");
        invoice.setCustomerName("lukas");
        result.add(invoice);

        return result;
    }

    @Override
    public Invoice getById(String number)
    {
        Invoice invoice = null;

        invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setCustomerName("Aeramen");
        invoice.setOrderNumber("ON_002");

        return invoice;
    }
}
