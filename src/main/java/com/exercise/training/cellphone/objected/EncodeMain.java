package com.exercise.training.cellphone.objected;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EncodeMain {

    public static void main(String[] args) {
        Button button2 = new Button(List.of('A', 'B', 'C'));
        Button button3 = new Button(List.of('D', 'E', 'F'));
        Button button4 = new Button(List.of('G', 'H', 'I'));
        Button button5 = new Button(List.of('J', 'K', 'L'));
        Button button6 = new Button(List.of('M', 'N', 'O'));
        Button button7 = new Button(List.of('P', 'Q', 'R', 'S'));
        Button button8 = new Button(List.of('T', 'U', 'V'));
        Button button9 = new Button(List.of('W', 'X', 'Y', 'Z'));

        Map<String, Button> ericsonKeyboard = new HashMap<>();
        ericsonKeyboard.put("2", button2);
        ericsonKeyboard.put("3", button3);
        ericsonKeyboard.put("4", button4);
        ericsonKeyboard.put("5", button5);
        ericsonKeyboard.put("6", button6);
        ericsonKeyboard.put("7", button7);
        ericsonKeyboard.put("8", button8);
        ericsonKeyboard.put("9", button9);

        CellPhone sonyEricson = new CellPhone(ericsonKeyboard);

        String result = encode("KOT", sonyEricson);
        System.out.println(result);
    }

    private static String encode(String world, CellPhone phone) {
        String encoded = "";
        Map<String, Button> keyBoard = phone.getKeyBoard();

        for(int i = 0; i < world.length(); i++) {
            Character simpleChar = world.charAt(i);
            String number = "";
            int howManyTimes = 0;

            howManyTimes = keyBoard.entrySet().stream()
                    .map(entry -> entry.getValue().getLetters())
                    .filter(characters -> characters.contains(simpleChar))
                    .map(characters -> characters.indexOf(simpleChar))
                    .collect(Collectors.toList())
                    .get(0);

            for(Map.Entry<String, Button> entry : keyBoard.entrySet()) {
                if(entry.getValue().getLetters().contains(simpleChar)) {
                    number = entry.getKey();
                }
            }

            for(int j = 0; j <= howManyTimes; j++) {
                encoded += number;
            }
        }

        return encoded;
    }
}
