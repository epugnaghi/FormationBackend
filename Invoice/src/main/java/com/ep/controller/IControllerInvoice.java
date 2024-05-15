package com.ep.controller;

import com.ep.entity.Invoice;

/*
controller - service - repository
 */
public interface IControllerInvoice
{
    String createInvoice(Invoice invoice);
}
