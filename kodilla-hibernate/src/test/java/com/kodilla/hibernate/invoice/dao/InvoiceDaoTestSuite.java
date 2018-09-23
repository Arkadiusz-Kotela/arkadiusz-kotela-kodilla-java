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
    InvoiceDao invoiceDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceSaveDao() {
        //Given
        Product car = new Product("Car");
        Product bike = new Product("Bike");
        Product motobike = new Product("Motobike");

        productDao.save(car);
        int carId = car.getId();
        productDao.save(bike);
        int bikeId = bike.getId();
        productDao.save(motobike);
        int motobikeId = motobike.getId();

        Item cars = new Item(car, new BigDecimal(12000), 2, new BigDecimal(24000));
        Item bikes = new Item(bike, new BigDecimal(800), 4, new BigDecimal(3200));
        Item motobikes = new Item(motobike, new BigDecimal(4000), 3, new BigDecimal(12000));

        cars.setProduct(car);
        bikes.setProduct(bike);
        motobikes.setProduct(motobike);

        itemDao.save(cars);
        int carsId = cars.getId();
        itemDao.save(bikes);
        int bikesId = bikes.getId();
        itemDao.save(motobikes);
        int motobikesId = motobikes.getId();

        Invoice invoice = new Invoice("1/2018");

        invoice.getItemList().add(cars);
        invoice.getItemList().add(bikes);
        invoice.getItemList().add(motobikes);

        cars.setItemInventory(invoice);
        bikes.setItemInventory(invoice);
        motobikes.setItemInventory(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, carId);
        Assert.assertNotEquals(0, bikeId);
        Assert.assertNotEquals(0, motobikeId);
        Assert.assertNotEquals(0, carsId);
        Assert.assertNotEquals(0, bikesId);
        Assert.assertNotEquals(0, motobikesId);
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
//        try {
//            invoiceDao.delete(invoice);
//            itemDao.delete(bikes);
//            itemDao.delete(motobikes);
//            itemDao.delete(cars);
//            productDao.delete(car);
//            productDao.delete(bike);
//            productDao.delete(motobike);
//        } catch (Exception e) {
//            //do nothing
//        }
    }
}
