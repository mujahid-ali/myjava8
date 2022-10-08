package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String[] args) {
        List<String> alphaNumerics = Arrays.asList("A11", "A44", "a22", "a49","G66");

        List<String> strList = alphaNumerics.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(strList);

        System.out.println(alphaNumerics.stream().map(String :: toUpperCase).filter(s -> s.startsWith("A")).collect(Collectors.toList()));

        //filter is a lazy operation on stream
        /*alphaNumerics.stream().filter(input->{
            System.out.println(input);
            return input.startsWith("A");
        }).count();*/

        alphaNumerics.stream().map(String :: toUpperCase).filter(s -> s.startsWith("A")).forEach(a-> System.out.println(a));
        //forEach using colon

        alphaNumerics.stream().map(String :: toLowerCase).filter(s -> s.startsWith("a")).forEach(System.out :: println);

    }
}
