package com.ep.service;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceInvoiceNumber implements IServiceInvoice
{
    @Value("${invoiceService.lastNumber}")
    private long lastNumber = 0L;

    @Autowired
    private IRepositoryInvoice invoiceRepository = null;

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

        invoiceRepository.create(invoice);
    }

    public IRepositoryInvoice getInvoiceRepository()
    {

        return invoiceRepository;
    }

    @Autowired
    public void setInvoiceRepository(IRepositoryInvoice invoiceRepository)
    {
        this.invoiceRepository = invoiceRepository;
    }

}
