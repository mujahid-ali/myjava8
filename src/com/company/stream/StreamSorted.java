package com.company.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(41);
        numbers.add(5);
        numbers.add(63);
        numbers.add(7);
        //normal insertion order
        System.out.println(numbers);

        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));

        System.out.println(numbers.stream().sorted((ele1, ele2) -> ele2.compareTo(ele1)).collect(Collectors.toList()));

        System.out.println(numbers.stream().sorted((elem1, elem2)-> -elem1.compareTo(elem2)).collect(Collectors.toList()));

    }
}
