package com.instagram;

/**
 * Example - 1
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 3, 3, 3};
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed().collect
                        (Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));

        Map.Entry<Integer, Long> integerLongEntry = map.entrySet()
                .stream().sorted(Map.Entry.<Integer, Long>comparingByValue()
                        .reversed()).findFirst().get();
        System.out.println(integerLongEntry.getKey());
    }
}
