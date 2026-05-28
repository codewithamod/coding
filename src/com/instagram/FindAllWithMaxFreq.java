package com.instagram;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllWithMaxFreq {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 4, 4, 3, 3, 3};
        Map<Integer, Long> collect =
                Arrays.stream(arr).boxed().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        Long value = collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .findFirst().get().getValue();
        List<Map.Entry<Integer, Long>> list = collect.entrySet().stream()
                .filter(x -> x.getValue().equals(value))
                .toList();
        System.out.println(list);

    }
}
