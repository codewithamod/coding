package com.instagram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachCharFreq {
    public static void main(String[] args) {
        String str = "banana";
        Map<String, Long> collect = Stream.of(str.split(""))
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));
        System.out.println(collect);
    }
}
