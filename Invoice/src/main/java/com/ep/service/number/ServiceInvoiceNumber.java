package com.ep.service.number;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service
public class ServiceInvoiceNumber implements IServiceInvoice
{
    private final IRepositoryInvoice invoiceRepository;
    @Value("${invoiceService.lastNumber}")
    private long lastNumber = 0L;

    public ServiceInvoiceNumber(IRepositoryInvoice invoiceRepository)
    {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice)
    {
        lastNumber++;

        invoice.setNumber(String.valueOf(lastNumber));

        invoiceRepository.create(invoice);
    }

    @Override
    public List<Invoice> getInvoiceList()
    {
        return null;
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
    }*/

}
