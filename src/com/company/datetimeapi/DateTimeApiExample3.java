package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeApiExample3 {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2016, 7,26);

        Period period = Period.between(startDate, todayDate);
        System.out.println(period.getYears());

        System.out.printf("Total Experience is %d years, %d months, %d days.", period.getYears(), period.getMonths(), period.getDays());
    }
}
