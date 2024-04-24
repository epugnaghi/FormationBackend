package com.ep.controller;

import com.ep.service.IServiceInvoice;

public interface IControllerInvoice
{
    void setInvoiceService(IServiceInvoice invoiceService);

    void createInvoice();
}
