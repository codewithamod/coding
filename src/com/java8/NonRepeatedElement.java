package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4};

        List<Integer> lst = Arrays.stream(arr).boxed().toList();

        List<Integer> list = lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
    }
}
