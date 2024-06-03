package com.ep.service.number;

import com.ep.entity.Invoice;
import com.ep.repository.IRepositoryInvoice;
import com.ep.service.IServiceInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInvoiceNumber implements IServiceInvoice
{
    @Autowired
    private final IRepositoryInvoice invoiceRepository;

    public ServiceInvoiceNumber(IRepositoryInvoice invoiceRepository)
    {
        this.invoiceRepository = invoiceRepository;
    }


    public Invoice createInvoice(Invoice invoice)
    {
        return invoiceRepository.create(invoice);
    }

    @Override
    public List<Invoice> getInvoiceList()
    {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number)
    {
        return invoiceRepository.getById(number);
    }

    public IRepositoryInvoice getInvoiceRepository()
    {
        return invoiceRepository;
    }

}
