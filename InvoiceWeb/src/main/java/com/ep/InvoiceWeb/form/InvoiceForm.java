package com.ep.InvoiceWeb.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class InvoiceForm
{
    private String number;

    //@NotBlank(message = "nom obligatoire")
    @NotBlank()
    private String customerName;

    //@Size(min = 1, max = 5, message = "taille entre 1 et 5")
    @Size(min = 1, max = 5)
    private String orderNumber;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

}
