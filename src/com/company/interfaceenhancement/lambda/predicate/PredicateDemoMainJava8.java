package com.company.interfaceenhancement.lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemoMainJava8 {

    public static void main(String[] args) {

        // in place of two additional class, only one line in Java8
        //Predicate<Integer> predicate = (Integer age) -> {return age > 18; };
        Predicate<Integer> predicate = age -> age > 18;
        System.out.println(predicate.test(21));
        System.out.println(predicate.test(10));

        ArrayList<String> names = new ArrayList<>();

        //Predicate<ArrayList> predicate1 = (ArrayList list) -> {return list.isEmpty();};
        Predicate<ArrayList> predicate1 = list -> list.isEmpty();
        System.out.println(predicate1.test(names));

        names.add("Ali");

        System.out.println(predicate1.test(names));
    }
}
