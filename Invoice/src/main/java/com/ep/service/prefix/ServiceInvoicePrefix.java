package com.ep.service.prefix;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Value;

//@Service
public class ServiceInvoicePrefix implements IServiceInvoice
{
    private final IRepositoryInvoice invoiceRepository;

    @Value("${invoiceService.lastNumber}")
    private long lastNumber;

    @Value("${invoiceService.prefix}")
    private String prefix;

    public ServiceInvoicePrefix(IRepositoryInvoice invoiceRepository)
    {
        this.invoiceRepository = invoiceRepository;
    }

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

    public Invoice createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(prefix + lastNumber);

        invoiceRepository.save(invoice);

        return invoice;
    }

    @Override
    public Iterable<Invoice> getInvoiceList()
    {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number)
    {
        return invoiceRepository.findById(number).orElseThrow();
    }

    public IRepositoryInvoice getInvoiceRepository()
    {
        return invoiceRepository;
    }

}
