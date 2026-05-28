package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TopElement {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1,23,2,3,43,4,5,6,34,8,9);

        // find top 3 element
        lst.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
