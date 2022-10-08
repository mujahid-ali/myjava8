package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeApiExample2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date.plusDays(15));
        System.out.println(date.plusYears(10));
        System.out.println(date.plusMonths(4));
        System.out.println(date.plusWeeks(54));

        System.out.println(date.minusDays(15));

        LocalTime time = LocalTime.now();

        System.out.println(time.plusHours(10));
        System.out.println(time.minusMinutes(5));

    }
}
