package com.ep.service;

import com.ep.entity.Invoice;

import java.util.List;

/*
controller - service - repository
 */
public interface IServiceInvoice
{
    void createInvoice(Invoice invoice);

    List<Invoice> getInvoiceList();

    Invoice getInvoiceByNumber(String number);
}
