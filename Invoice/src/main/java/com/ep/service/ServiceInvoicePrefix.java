package com.ep.service;

import com.ep.dao.IDaoInvoice;
import com.ep.entity.Invoice;

public class ServiceInvoicePrefix implements IServiceInvoice
{
    private static long lastNumber = 123L;
    private IDaoInvoice invoiceDao = null;

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber("Prefix_" + lastNumber);

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
