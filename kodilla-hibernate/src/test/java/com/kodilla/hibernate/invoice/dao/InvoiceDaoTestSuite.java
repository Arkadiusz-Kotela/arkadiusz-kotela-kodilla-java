package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceSaveDao() {
        //Given
        Product book = new Product("Book");
        Product pen = new Product("Pen");

        productDao.save(book);
        productDao.save(pen);

        Item books = new Item(book, new BigDecimal(20), 2, new BigDecimal(40));
        Item pens = new Item(pen, new BigDecimal(5), 10, new BigDecimal(50));

        books.setProduct(book);
        pens.setProduct(pen);

        itemDao.save(books);
        itemDao.save(pens);

        Invoice invoice = new Invoice("01/2018");
        invoiceDao.save(invoice);
        invoice.getItems().add(books);
        invoice.getItems().add(pens);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //Clean Up
        try {
            invoiceDao.delete(invoice);
            itemDao.delete(pens);
            itemDao.delete(books);
            productDao.delete(pen);
            productDao.delete(book);

        } catch (Exception e) {
            //do nothing
        }
    }
}
