package com.company.stream;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToSetToMap {

    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(3);
        numSet.add(4);
        numSet.add(7);
        numSet.add(9);

        Set<Integer> filteredSet = numSet.stream().filter( x -> x>3).collect(Collectors.toSet());
        System.out.println(filteredSet);

        Map<Integer, Integer> map = numSet.stream().collect(Collectors.toMap(x -> x, y -> y*10));
        System.out.println(map);
    }
}
