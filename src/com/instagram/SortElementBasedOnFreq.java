package com.instagram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortElementBasedOnFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        collect.entrySet().stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
