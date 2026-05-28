package com.instagram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        int k = 2;
        Map<Integer, Long> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        List<Map.Entry<Integer, Long>> list = collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(k).toList();

        System.out.println(list);
    }
}
