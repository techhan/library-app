package com.group.libraryapp.homework.dto.response;

import com.group.libraryapp.homework.dto.request.CalculatorRequest;

public class CalculatorResponse {
    private int add;
    private int minus;
    private int multiply;

    public CalculatorResponse(CalculatorRequest num) {
        this.add = num.getNum1() + num.getNum2();
        this.minus = num.getNum1() - num.getNum2();
        this.multiply = num.getNum1() * num.getNum2();
    }

    public int getAdd() {
        return add;
    }

    public int getMinus() {
        return minus;
    }

    public int getMultiply() {
        return multiply;
    }
}
