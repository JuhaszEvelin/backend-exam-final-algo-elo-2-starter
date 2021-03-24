package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        Integer sum = 0;

        sum = numbers.stream().filter(num -> Math.abs(num % 2) == 1).reduce(0, Integer::sum);

        return sum;
    }
}