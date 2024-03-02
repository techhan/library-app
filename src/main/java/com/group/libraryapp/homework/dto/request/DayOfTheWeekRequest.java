package com.group.libraryapp.homework.dto.request;

import java.time.LocalDate;

public class DayOfTheWeekRequest {

    private LocalDate date;

    public DayOfTheWeekRequest(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}