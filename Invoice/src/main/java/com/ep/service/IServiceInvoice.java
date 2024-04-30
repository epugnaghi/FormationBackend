package com.ep.service;

import com.ep.dao.IDaoInvoice;
import com.ep.entity.Invoice;


public interface IServiceInvoice
{
    void setInvoiceDao(IDaoInvoice invoiceDao);

    void createInvoice(Invoice invoice);
}
