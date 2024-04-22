package com.ep.service;

import com.ep.dao.InvoiceDao;
import com.ep.entity.Invoice;

public class InvoiceService
{
    private static long lastNumber = 0L;
    private final InvoiceDao invoiceDao = new InvoiceDao();

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

        invoiceDao.create(invoice);
    }

}
