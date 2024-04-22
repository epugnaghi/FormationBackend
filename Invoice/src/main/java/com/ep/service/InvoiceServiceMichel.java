package com.ep.service;

import com.ep.dao.IInvoiceDao;
import com.ep.entity.Invoice;

public class InvoiceServiceMichel implements IInvoiceService
{
    private static long lastNumber = 112L;
    private final IInvoiceDao invoiceDao = null;//new InvoiceDaoMichel();

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber("INV_" + lastNumber);

        invoiceDao.create(invoice);
    }
}
