package com.group.libraryapp.homework.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 25)
    private String name;
    private long price;

    @Column(name = "warehousingDate")
    private LocalDate warehousingDate;
    @ColumnDefault("0")
    private int salesYN;

    protected Fruit() {
    }

    public Fruit(long id, String name, long price, LocalDate warehousingDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
    }

    public Fruit(String name, long price, LocalDate warehousingDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
    }

    public Fruit(long id, String name, long price, LocalDate warehousingDate, int salesYN) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
        this.salesYN = salesYN;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public int getSalesYN() {
        return salesYN;
    }

    public void setSalesYN() {
        this.salesYN = 1;
    }
}
