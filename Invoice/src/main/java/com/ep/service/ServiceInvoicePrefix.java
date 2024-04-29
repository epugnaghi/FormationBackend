package com.ep.service;

import com.ep.dao.IDaoInvoice;
import com.ep.entity.Invoice;

public class ServiceInvoicePrefix implements IServiceInvoice
{
    private long lastNumber;
    private String prefix;
    private IDaoInvoice invoiceDao = null;

    public long getLastNumber()
    {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber)
    {
        this.lastNumber = lastNumber;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(prefix + lastNumber);

        invoiceDao.create(invoice);
    }

    public IDaoInvoice getInvoiceDao()
    {

        return invoiceDao;
    }

    public void setInvoiceDao(IDaoInvoice invoiceDao)
    {

        this.invoiceDao = invoiceDao;
    }

}
