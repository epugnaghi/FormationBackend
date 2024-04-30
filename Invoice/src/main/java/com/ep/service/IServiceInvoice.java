package com.ep.service;

import com.ep.entity.Invoice;


public interface IServiceInvoice
{
    //void setInvoiceRepository(IRepositoryInvoice invoiceRepository);

    void createInvoice(Invoice invoice);
}
