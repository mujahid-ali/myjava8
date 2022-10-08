package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7]
        //Until Java 7 - Odd numbers

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if(num%2 !=0 ){
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);//[1, 3, 5, 7]

        oddNumbers = numbers.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers using java8-streams" + oddNumbers);

        // using predicate
        Predicate<Integer> predicate = num -> num % 2 != 0;
        oddNumbers = numbers.stream().filter(predicate).collect(Collectors.toList());
        System.out.println("Using predicate = " + oddNumbers);
    }
}
