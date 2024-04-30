package com.ep.service;

import com.ep.dao.IDaoInvoice;
import com.ep.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceInvoicePrefix implements IServiceInvoice
{
    @Value("${invoiceService.lastNumber}")
    private long lastNumber;

    @Value("${invoiceService.prefix}")
    private String prefix;

    @Autowired
    private IDaoInvoice invoiceDao = null;

    public long getLastNumber()
    {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber)
    {
        this.lastNumber = lastNumber;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(prefix + lastNumber);

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
