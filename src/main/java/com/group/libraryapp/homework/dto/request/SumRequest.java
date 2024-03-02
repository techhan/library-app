package com.group.libraryapp.homework.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class SumRequest {
    private List<Integer> numbers;

    @JsonCreator
    public SumRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
