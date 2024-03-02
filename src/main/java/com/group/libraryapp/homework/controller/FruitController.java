package com.group.libraryapp.homework.controller;


import com.group.libraryapp.homework.dto.request.FruitSalesUpdateRequest;
import com.group.libraryapp.homework.dto.request.FruitSaveRequest;
import com.group.libraryapp.homework.dto.response.FruitCountResponse;
import com.group.libraryapp.homework.dto.response.FruitListResponse;
import com.group.libraryapp.homework.dto.response.FruitStatResponse;
import com.group.libraryapp.homework.service.fruit.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/fruit")
@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping()
    public void save(@RequestBody FruitSaveRequest request) {
        fruitService.save(request);
    }

    @PutMapping()
    public void update(@RequestBody FruitSalesUpdateRequest request) {
       fruitService.update(request.getId());
    }

    @GetMapping("/stat")
    public FruitStatResponse fruitStat (@RequestParam String name) {
        return fruitService.fruitStat(name);
    }

    @GetMapping("/count")
    public FruitCountResponse getCount(@RequestParam String name) {
        return fruitService.getCount(name);
    }

    @GetMapping("list")
    public List<FruitListResponse> getList(@RequestParam String option, @RequestParam long price)  {
        return fruitService.getList(option, price);
    }
}
