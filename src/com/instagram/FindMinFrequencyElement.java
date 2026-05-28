package com.instagram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMinFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 2, 2, 2};
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors
                        .groupingBy
                                (Function.identity(),
                                        Collectors.counting()));

        Map.Entry<Integer, Long> integerLongEntry = collect.entrySet()
                .stream().sorted(Map.Entry.<Integer, Long>comparingByValue())
                .findFirst()
                .get();
        System.out.println(integerLongEntry);

    }
}
