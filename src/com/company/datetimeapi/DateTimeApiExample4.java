package com.company.datetimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiExample4 {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");
        System.out.println(LocalDateTime.now(zoneIdLA));

        System.out.println(ZonedDateTime.now(zoneIdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");
        System.out.println("Date Time at GMT+05:30 : "+ ZonedDateTime.now(zoneIdGMT));

        ZoneId zoneIdGMT00 = ZoneId.of("GMT+00:00");
        System.out.println("Date Time at GMT+00:00 : "+ ZonedDateTime.now(zoneIdGMT00));

        System.out.println(Instant.now());//same as GMT+00:00



    }
}
