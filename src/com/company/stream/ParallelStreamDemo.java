package com.company.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().forEach(System.out::println);

        System.out.println("--------------------------------");

        list.stream().parallel().forEach(System.out::println);
        System.out.println("Another way of using parallel stream, order will not be maintained in both ways" +
                " but it's faster than normal stream");
        list.parallelStream().forEach(System.out::println);
    }
}
