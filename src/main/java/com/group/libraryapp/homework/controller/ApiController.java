package com.group.libraryapp.homework.controller;

import com.group.libraryapp.homework.dto.request.CalculatorRequest;
import com.group.libraryapp.homework.dto.request.DayOfTheWeekRequest;
import com.group.libraryapp.homework.dto.request.SumRequest;
import com.group.libraryapp.homework.dto.response.CalculatorResponse;
import com.group.libraryapp.homework.dto.response.DayOfTheWeekResponse;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/calc")
    public CalculatorResponse calculator(CalculatorRequest request) {
        return new CalculatorResponse(request);
    }

    @GetMapping("/day-of-the-week")
    public DayOfTheWeekResponse getDayOfTheWeek(DayOfTheWeekRequest request) {
        LocalDate date = request.getDate();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return new DayOfTheWeekResponse(dayOfWeek);
    }

    @PostMapping("/sum")
    public int sum(@RequestBody SumRequest request) {

        List<Integer> numbers = request.getNumbers();

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum;
    }
}
