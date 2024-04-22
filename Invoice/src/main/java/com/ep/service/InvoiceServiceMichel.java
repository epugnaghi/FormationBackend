package com.ep.service;

import com.ep.dao.InvoiceDaoMichel;
import com.ep.entity.Invoice;

public class InvoiceServiceMichel
{
    private static long lastNumber = 112L;
    private final InvoiceDaoMichel invoiceDao = new InvoiceDaoMichel();

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber("INV_" + lastNumber);

        invoiceDao.create(invoice);
    }

}
