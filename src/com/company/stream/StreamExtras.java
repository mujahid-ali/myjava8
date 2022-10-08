package com.company.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {

    public static void main(String[] args) {
        int[] a = {2,4,6,1,4,5};

        IntStream is = Arrays.stream(a);

        // another way

        Stream s1 = Stream.of(a);

        Stream s2 = Stream.of(2,3,4,1);
        Stream s3 = Stream.of(12,9,2,4);

        Stream s4 = Stream.concat(s2, s3).distinct().sorted();

        s4.forEach(System.out :: println);

        IntStream stream_2_10 = IntStream.range(2, 11);
        stream_2_10.forEach(value -> System.out.print(value + " "));

        System.out.println();
        System.out.println("closed range");

        IntStream stream_2_11 = IntStream.rangeClosed(2,11);
        stream_2_11.forEach(value -> System.out.print(value + " "));

    }
}
