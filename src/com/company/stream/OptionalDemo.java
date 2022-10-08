package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String[] args) {
        List<String> flats = Arrays.asList("B01", "B08", "B11", "T01", "B01", "B05", "B01", "B05", "T07");

        Optional<String> result = flats.stream().filter(flat -> flat.startsWith("B")).findFirst();
        //Optional<String> result = flats.stream().filter(flat -> flat.startsWith("Y")).findFirst();

        if (result.isPresent()) {
            System.out.println(result.get());
        }
        else {
            System.out.println("NO result found");
        }

        // Another way
        result.ifPresent(value -> System.out.println(value));
        result.ifPresent(System.out :: println);
        System.out.println(result.orElse("no data found in orElse"));

        String out = result.orElseGet(() -> {return "no data";});
        System.out.println("out from orElseGet " + out);

        //result.orElseThrow(() -> new RuntimeException());

        Optional<String> opt1 = Optional.of("Java 8 optional of method");
        System.out.println(opt1);
        System.out.println(opt1.get());

        String name = null;
        Optional<String> opt2 = Optional.ofNullable(name);
        System.out.println(opt2);
       // System.out.println(opt2.get()); // this will give error as null value

        String name2 = "Ali";
        Optional<String> opt3 = Optional.ofNullable(name2);
        System.out.println(opt3);
        System.out.println(opt3.get());

        String test1 = "null";
        String test2 = null;

        if ("null".equals(test1)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        System.out.println(test1);
        System.out.println(test2);

    }
}
