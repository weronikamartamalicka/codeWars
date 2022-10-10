package com.exercise.training.reverse;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(getReversed2("Ala ma kota"));
    }

    public static String getReversed(String sentence) {
        String reversedSentence = "";

        for(int i = sentence.length() - 1; i >= 0; i--) {
            char letter = sentence.charAt(i);
            reversedSentence = reversedSentence + letter;
        }
        return reversedSentence;
    }

    public static String getReversed2(String sentence) {

        if(sentence.length() == 1) {
            return sentence;
        } else if(sentence.length() == 0) {
            return " ";
        } else {
           String reversedSentence = getReversed2(sentence.substring(1)) + sentence.charAt(0);
           return reversedSentence;
        }
    }
}
