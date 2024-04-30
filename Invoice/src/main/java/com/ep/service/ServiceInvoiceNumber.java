package com.ep.service;

import com.ep.dao.IDaoInvoice;
import com.ep.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceInvoiceNumber implements IServiceInvoice
{
    @Value("${invoiceService.lastNumber}")
    private long lastNumber = 0L;

    @Autowired
    private IDaoInvoice invoiceDao = null;

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

        invoiceDao.create(invoice);
    }

    public IDaoInvoice getInvoiceDao()
    {

        return invoiceDao;
    }

    @Autowired
    public void setInvoiceDao(IDaoInvoice invoiceDao)
    {
        this.invoiceDao = invoiceDao;
    }

}
