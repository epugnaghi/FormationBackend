package com.ep.service;

import com.ep.dao.IInvoiceDao;
import com.ep.entity.Invoice;

public class InvoiceServiceNumber implements IInvoiceService
{
    private static long lastNumber = 0L;
    private IInvoiceDao invoiceDao = null;

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

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
