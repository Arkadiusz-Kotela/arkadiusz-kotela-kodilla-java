package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @NotNull
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "INVOICE_NO")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "items",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setNumber(String number) {
        this.number = number;
    }
}
