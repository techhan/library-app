package com.group.libraryapp.homework.domain;

import com.group.libraryapp.homework.dto.response.FruitListResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findAllByNameAndSalesYN(String name, int salesYn);

    int countByName(String name);

    Optional<List<FruitListResponse>> findAllByPriceGreaterThanEqual(long price);
    Optional<List<FruitListResponse>> findAllByPriceLessThanEqual(long price);
}
