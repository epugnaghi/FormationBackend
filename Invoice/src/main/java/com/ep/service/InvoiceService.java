package com.ep.service;

import com.ep.dao.IInvoiceDao;
import com.ep.entity.Invoice;

public class InvoiceService implements IInvoiceService
{
    private static long lastNumber = 0L;
    private final IInvoiceDao invoiceDao = null;//new InvoiceDao();

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

        invoiceDao.create(invoice);
    }

}
