package com.exercise.interview.link4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringExample {

    public void replaceString(List<String> list) {
        List<Integer> integerRepresentation = new ArrayList<>();

        for(String example : list) {
            String lowerCase = example.toLowerCase();
            int index = lowerCase.indexOf(":");
            String preparedString = lowerCase.substring(index + 2);
            String trimmedString = preparedString.trim();
            String replacedString = trimmedString.replaceAll(" ", "");

            for(int i = 0; i < replacedString.length(); i++) {
                int replacedChar = replacedString.charAt(i);
                integerRepresentation.add(replacedChar);
            }
        }
        int sum = 0;
        int min = 0;
        int max = 0;
        double average = 0;

        Collections.sort(integerRepresentation);
        min = integerRepresentation.get(0);
        max = integerRepresentation.get(integerRepresentation.size() - 1);

        for(int j = 0; j < integerRepresentation.size(); j++) {
            sum += integerRepresentation.get(j);
        }
        average = sum / (double)integerRepresentation.size();

        System.out.println("Sum: " + sum +"\nMin: " + min + "\nMax: " + max + "\nAverage: " + average);

        calculateStatistics(integerRepresentation);
    }

    public void calculateStatistics(List<Integer> list) {
        int min = list.stream()
                .min(Integer::compareTo)
                .orElse(0);

        int max = list.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int sum = list.stream()
                .reduce(0, Integer::sum);

        double average = sum / (double)list.size();

        System.out.println("Sum: " + sum +"\nMin: " + min + "\nMax: " + max + "\nAverage: " + average);
    }
}
