package com.group.libraryapp.homework.dto.request;

public class FruitSalesUpdateRequest {
    private long id;

    public FruitSalesUpdateRequest() {
    }

    public FruitSalesUpdateRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
