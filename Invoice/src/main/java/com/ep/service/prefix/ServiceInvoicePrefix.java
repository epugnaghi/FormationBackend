package com.ep.service.prefix;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
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

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(prefix + lastNumber);

        invoiceRepository.create(invoice);
    }

    public IRepositoryInvoice getInvoiceRepository()
    {
        return invoiceRepository;
    }

    /*
    @Autowired
    public void setInvoiceRepository(IRepositoryInvoice invoiceRepository)
    {
        this.invoiceRepository = invoiceRepository;
    }
    */
}
