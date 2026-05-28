package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};

        List<Integer> lst = Arrays.stream(arr).boxed().toList();

        Set<Integer> set = new HashSet<>();

        List<Integer> duplicates = lst.stream().filter(x -> !set.add(x))
                .toList().stream().distinct().toList();

        System.out.println(duplicates);
    }
}
