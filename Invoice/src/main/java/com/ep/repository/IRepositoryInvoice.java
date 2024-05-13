package com.ep.repository;

import com.ep.entity.Invoice;

/*
controller - service - repository
 */
public interface IRepositoryInvoice
{
    void create(Invoice invoice);
}
