package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccuranc {
    public static void main(String[] args) {
        String str = "hello";
        Map<String, Long> collect = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
