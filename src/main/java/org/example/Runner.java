package org.example;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double average = CollectionUtil.calculateAverage(numbers);
        System.out.println("Average: " + average);

        List<Integer> list1 = Arrays.asList(0, 9, 8);
        List<Integer> list2 = Arrays.asList(7, 6, 5);

        List<Integer> mergedList = CollectionUtil.mergeLists(list1, list2);
        System.out.println("Merged list: " + mergedList);

        int target = 1;
        boolean contains = CollectionUtil.containsNumber(numbers, target);
        System.out.println("Contains " + target + ": " + contains);
    }
}
