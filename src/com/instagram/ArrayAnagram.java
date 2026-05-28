package com.instagram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayAnagram {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3,3};
        int[] arr2 = {1,1,2,2,3,3};

        Map<Integer, Long> collect = Arrays.stream(arr1).boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));

        Map<Integer, Long> collect1 = Arrays.stream(arr2).boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));

        boolean equals = collect1.equals(collect);

        System.out.println(equals);
    }
}
