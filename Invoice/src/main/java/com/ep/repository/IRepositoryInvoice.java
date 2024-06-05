package com.ep.repository;

import com.ep.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

/*
controller - service - repository
 */
public interface IRepositoryInvoice extends CrudRepository<Invoice, String>
{
    /*
    Invoice create(Invoice invoice);

    List<Invoice> list();

    Invoice getById(String number);

     */
}
