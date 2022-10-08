package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApiExample1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime futureDateTime = LocalDateTime.of(2023, Month.NOVEMBER, 6, 21, 22, 2);
        System.out.println(futureDateTime);

    }
}
