package com.exercise.training.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    private List<Integer> numbersList;
    private List<String> resultList;

    private void fillList() {
        numbersList = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            numbersList.add(i);
        }
    }

    public void fizzBuzz() {
        fillList();
        resultList = new ArrayList<>();
        String result;

        for(Integer number : numbersList) {
            if(number % 15 == 0) {
                System.out.println("FizzBuzz");
                result = "FizzBuzz";
                resultList.add(result + "\n");
            } if(number % 3 == 0) {
                System.out.println("Fizz");
                result = "Fizz";
                resultList.add(result);
            } if(number % 5 == 0) {
                System.out.println("Buzz");
                result = "Buzz";
                resultList.add(result);
            } if(number % 5 !=0 && number % 3 != 0) {
                System.out.println(number);
                result = String.valueOf(number);
                resultList.add(result);
            }
        }
        System.out.print(resultList);
    }

    public void fizzBuzz2() {
        StringBuilder str = new StringBuilder();

        for(int i = 1; i < 101; i ++) {
            String[] array = new String[]{ i +"", "Fizz", "Buzz", "FizzBuzz"};
            int index = (i % 5 == 0? 1 : 0) + (i % 3 == 0? 2 : 0);
            StringBuilder result = str.append(array[index]).append("\n");
            System.out.println(result);

        }
    }

    public void fizzBuzz3() {
        Integer[] array = new Integer[101];

        IntStream.rangeClosed(0, 99).forEach(number -> array[number] = number + 1);

        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(number -> {
            if(number == null) {
                result.append(" ");
            } else if(number % 5 == 0) {
                result.append("Fizz").append("\n");
            } else {
                result.append(number).append("\n");
            }
        });
        System.out.println(result);
    }
}
