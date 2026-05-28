package com.java8;

import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1,43,2,3,56,4,5,6,7);

        Integer i = lst.stream().max(Integer::max).get();

        System.out.println(i);
    }
}
