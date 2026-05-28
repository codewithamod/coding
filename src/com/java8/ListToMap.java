package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> collect = lst.stream().collect(Collectors.toMap(x -> x, x -> x));
        System.out.println(collect);

    }
}
