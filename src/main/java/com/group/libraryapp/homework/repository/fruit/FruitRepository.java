package com.group.libraryapp.homework.repository.fruit;

import com.group.libraryapp.homework.dto.request.FruitSaveRequest;

public interface FruitRepository {
    void save(FruitSaveRequest request);
    void update(long id);
    long getAmount(String name, int salesYN);
}
