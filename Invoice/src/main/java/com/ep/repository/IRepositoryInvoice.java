package com.ep.repository;

import com.ep.entity.Invoice;

import java.util.List;

/*
controller - service - repository
 */
public interface IRepositoryInvoice
{
    Invoice create(Invoice invoice);

    List<Invoice> list();

    Invoice getById(String number);
}
