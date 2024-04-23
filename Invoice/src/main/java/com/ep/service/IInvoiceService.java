package com.ep.service;

import com.ep.dao.IInvoiceDao;
import com.ep.entity.Invoice;

public interface IInvoiceService
{
    void setInvoiceDao(IInvoiceDao invoiceDao);

    void createInvoice(Invoice invoice);
}
