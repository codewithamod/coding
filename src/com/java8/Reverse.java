package com.java8;

import java.util.stream.Stream;

public class Reverse {
    public static void main(String[] args) {
        String str = "hello world";
        String reduce = Stream.of(str.split(" ")).reduce("", (a, b) -> b + a + " ").trim();
        System.out.println(reduce);
    }
}
