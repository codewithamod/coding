package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionMembers {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> collect = lst.stream().collect(Collectors.partitioningBy(x -> (x % 2 == 0)));
        System.out.println(collect);
    }
}
