package com.ep.repository.memory;


import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;

import java.util.Optional;

//@Repository
public class RepositoryInvoiceMemory implements IRepositoryInvoice
{
    @Override
    public <S extends Invoice> S save(S entity)
    {
        return null;
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities)
    {
        return null;
    }

    @Override
    public Optional<Invoice> findById(String s)
    {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s)
    {
        return false;
    }

    @Override
    public Iterable<Invoice> findAll()
    {
        return null;
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> strings)
    {
        return null;
    }

    @Override
    public long count()
    {
        return 0;
    }

    @Override
    public void deleteById(String s)
    {

    }

    @Override
    public void delete(Invoice entity)
    {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings)
    {

    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> entities)
    {

    }

    @Override
    public void deleteAll()
    {

    }
    /*
    private static final List<Invoice> listInvoice = new ArrayList<>();

    public Invoice save(Invoice invoice)
    {
        listInvoice.add(invoice);
        System.out.println("Memory-invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());

        return invoice;
    }

    @Override
    public Iterable<Invoice> findAll()
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
    public Optional<Invoice> findById(String number)
    {

        Invoice invoice = null;

        invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setCustomerName("Aeramen");
        invoice.setOrderNumber("ON_002");

        return invoice;

    }

     */
}

