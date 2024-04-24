package com.ep.service;

import com.ep.dao.IInvoiceDao;
import com.ep.entity.Invoice;

public class InvoiceServiceINV_Number implements IInvoiceService
{
    private static long lastNumber = 112L;
    private IInvoiceDao invoiceDao = null;

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber("INV_" + lastNumber);

        invoiceDao.create(invoice);
    }

    public IInvoiceDao getInvoiceDao()
    {
        return invoiceDao;
    }

    public void setInvoiceDao(IInvoiceDao invoiceDao)
    {
        this.invoiceDao = invoiceDao;
    }
}
