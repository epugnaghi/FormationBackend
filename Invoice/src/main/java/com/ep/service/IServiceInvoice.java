package com.ep.service;

import com.ep.entity.Invoice;

/*
controller - service - repository
 */
public interface IServiceInvoice
{
    void createInvoice(Invoice invoice);
}
