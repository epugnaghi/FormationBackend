package com.ep.service;

import com.ep.entity.Invoice;

/*
controller - service - repository
 */
public interface IServiceInvoice
{
    Invoice createInvoice(Invoice invoice);

    Iterable<Invoice> getInvoiceList();

    Invoice getInvoiceByNumber(String number);
}
