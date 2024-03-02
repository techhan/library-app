package com.group.libraryapp.homework.dto.response;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfTheWeekResponse {
    private String dayOfTheWeek;

    public DayOfTheWeekResponse(DayOfWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
