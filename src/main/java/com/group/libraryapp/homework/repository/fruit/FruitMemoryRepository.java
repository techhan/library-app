package com.group.libraryapp.homework.repository.fruit;

import com.group.libraryapp.homework.domain.Fruit;
import com.group.libraryapp.homework.dto.request.FruitSaveRequest;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Primary
@Repository
public class FruitMemoryRepository implements FruitRepository{

    private final List<Fruit> fruits = new ArrayList<>();
    private long sequence = 0;

    @Override
    public void save(FruitSaveRequest request) {
        System.out.println("FruitMemoryRepository.save");
        fruits.add(new Fruit(++sequence, request.getName(),
                    request.getPrice(), request.getWarehousingDate()));
    }

    @Override
    public void update(long id) {
        System.out.println("FruitMemoryRepository.update");
        for (Fruit fruit : fruits) {
            if(fruit.getId() == id) {
                fruit.setSalesYN();
                break;
            }
        }
    }

    @Override
    public long getAmount(String name, int salesYN) {
        System.out.println("FruitMemoryRepository.getAmount");
        long amount = 0;

        for (Fruit fruit : fruits) {
            if(fruit.getName().equals(name))
            {
                if(fruit.getSalesYN() == salesYN) {
                    amount += fruit.getPrice();
                }
            }
        }
        return amount;
    }
}
