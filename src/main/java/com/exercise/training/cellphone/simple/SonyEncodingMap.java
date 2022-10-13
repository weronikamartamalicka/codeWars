package com.exercise.training.cellphone.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SonyEncodingMap implements EncodingMap {

    private Map<String, String> sonyMap;

    public void generateEncodingMap() {
        sonyMap = new HashMap<>();
        sonyMap.put("A", "2");
        sonyMap.put("B", "22");
        sonyMap.put("C", "222");
        sonyMap.put("D", "3");
        sonyMap.put("E", "33");
        sonyMap.put("F", "333");
        sonyMap.put("G", "4");
    }

    public String encode(String world) {
        String encoded = "";
        if(Objects.nonNull(sonyMap) && Objects.nonNull(world)) {

            return Arrays.asList(world.toCharArray()).stream()
                    .map(character -> mapper(String.valueOf(character)))
                    .reduce(encoded, (previous, current) -> current += previous);
        }
        return "";
    }

    private String mapper(String letter) {
        return sonyMap.getOrDefault(letter, "");
    }

    public String encodeWithRecursion(String world) {
        String result = "";
        if(world.length() == 0) {
            return "";
        } else {
            result = mapper(String.valueOf(world.charAt(0)));
            return result + encodeWithRecursion(world.substring(1));
        }
    }
}
