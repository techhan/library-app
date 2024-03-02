package com.group.libraryapp.homework.service.fruit;

import com.group.libraryapp.homework.domain.Fruit;
import com.group.libraryapp.homework.domain.FruitRepository;
import com.group.libraryapp.homework.dto.request.FruitSaveRequest;
import com.group.libraryapp.homework.dto.response.FruitCountResponse;
import com.group.libraryapp.homework.dto.response.FruitListResponse;
import com.group.libraryapp.homework.dto.response.FruitStatResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public void save(FruitSaveRequest request) {
        fruitRepository.save(new Fruit(request.getName(), request.getPrice(), request.getWarehousingDate()));
    }

    public void update(long id) {
        Fruit fruit = fruitRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        fruit.setSalesYN();
        fruitRepository.save(fruit);
    }

    public FruitStatResponse fruitStat(String name) {
        List<Fruit> salesList = fruitRepository.findAllByNameAndSalesYN(name, 1);
        List<Fruit> notSalesList = fruitRepository.findAllByNameAndSalesYN(name, 0);

        long salesAmount = 0;
        long notSalesAmount = 0;

        for (Fruit fruit : salesList) {
            salesAmount += fruit.getPrice();
        }

        for(Fruit fruit : notSalesList) {
            notSalesAmount += fruit.getPrice();
        }

        return new FruitStatResponse(salesAmount, notSalesAmount);
    }

    public FruitCountResponse getCount(String name) {
        return new FruitCountResponse(fruitRepository.countByName(name));
    }

    public List<FruitListResponse> getList(String option, long price) {
        Optional<List<FruitListResponse>> list;

        if(option.equals("GTE")) {
            list = fruitRepository.findAllByPriceGreaterThanEqual(price);
        }
        else {
            list = fruitRepository.findAllByPriceLessThanEqual(price);
        }
        return list.orElseThrow(IllegalArgumentException::new);
    }
}
