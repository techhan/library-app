package com.group.libraryapp.homework.dto.response;

import java.time.LocalDate;

public class FruitListResponse {
    private String name;
    private long price;
    private LocalDate warehousingDate;

    public FruitListResponse(String name, long price, LocalDate warehousingDate) {
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
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
}
