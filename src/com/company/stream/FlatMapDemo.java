package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11,22,33,44,55,66,77);
        System.out.println("numList = " + numList);

        List<Integer> numList2 = numList.stream().map(x -> x).collect(Collectors.toList());
        System.out.println(numList2);

        List numList3 = numList.stream().map(x -> Arrays.asList(x, x + 1)).collect(Collectors.toList());
        System.out.println(numList3);

        List numList4 = numList.stream().flatMap(x -> Stream.of(x, x + 1)).collect(Collectors.toList());
        System.out.println(numList4);

        List numList5 = numList.stream().flatMap(x -> {
            if (x %2 != 0) {
                return Stream.empty();
            }
            else {
                return Stream.of(x, x * 2, x*5);
            }
        }).collect(Collectors.toList());

        System.out.println(numList5);
    }
}
