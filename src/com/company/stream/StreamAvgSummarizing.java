package com.company.stream;

import com.company.interfaceenhancement.lambda.Calculator;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {

    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(11);
        numSet.add(12);
        numSet.add(13);
        numSet.add(224);
        numSet.add(15);
        numSet.add(105);

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(11);
        numSet2.add(12);
        numSet2.add(13);
        numSet2.add(224);
        numSet2.add(15);
        numSet2.add(105);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(avg);

        IntSummaryStatistics statistics = numSet.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(statistics);
        System.out.println(statistics.getSum());
        System.out.println(statistics.toString());
        System.out.println(statistics.getMax());

        IntSummaryStatistics statistics2 = numSet2.stream().collect(Collectors.summarizingInt(x->x));
        statistics.combine(statistics2);

        System.out.println(statistics);
    }
}
