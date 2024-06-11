package com.ep.entity;


import jakarta.persistence.*;

/*
agregate root
 */
@Entity
public class Invoice
{
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_NUMBER")
    private String number;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "ORDER_NUMBER")
    private String orderNumber;
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_NUMBER", columnDefinition = "BIGINT")
    private String number;

    @Column(length = 13)
    private String orderNumber;

    @Column(nullable = false, length = 50)
    private String customerName;

    public Invoice(String number, String customerName)
    {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName, String orderNumber)
    {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    public Invoice()
    {
    }

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
