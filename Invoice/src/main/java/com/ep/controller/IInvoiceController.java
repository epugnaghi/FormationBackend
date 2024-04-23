package com.ep.controller;

import com.ep.service.IInvoiceService;

public interface IInvoiceController
{
    void setInvoiceService(IInvoiceService invoiceService);

    void createInvoice();
}
