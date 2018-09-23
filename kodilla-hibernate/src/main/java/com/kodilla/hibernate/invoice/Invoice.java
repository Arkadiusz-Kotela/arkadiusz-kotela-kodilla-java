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
    private List<Item> itemList = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
            mappedBy = "itemInventory",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER
    )
    public List<Item> getItemList() {
        return itemList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
