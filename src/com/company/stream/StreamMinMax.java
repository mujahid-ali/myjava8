package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(55,22,1,48,101,77);
        List<Integer> duplicateNumList = Arrays.asList(55,22,1,48,101,77,1,48,101,77);

        Integer minVal = numList.stream().min( (a,b) -> a.compareTo(b) ).get();
        Integer maxVal = numList.stream().max((a,b) -> a.compareTo(b)).get();

        System.out.println("minVal = " + minVal + " maxVal = " +maxVal);

        int min = numList.stream().min(StreamMinMax :: sortElements).get();
        int max = numList.stream().max(StreamMinMax::sortElements).get();

        System.out.println("min = " + min + " max = " +max);

        System.out.println(duplicateNumList.stream().sorted().collect(Collectors.toList()));
        System.out.println(duplicateNumList.stream().distinct().sorted().collect(Collectors.toList()));


    }

    public  static Integer sortElements(Integer a, Integer b) {
        return a.compareTo(b);
    }
}
