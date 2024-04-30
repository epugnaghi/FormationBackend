package com.ep.service;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;


public interface IServiceInvoice
{
    void setInvoiceRepository(IRepositoryInvoice invoiceRepository);

    void createInvoice(Invoice invoice);
}
