package com.exercise.training.cellphone.simple;

import java.util.Map;

public interface EncodingMap {

    Map<String,String> encodingMap = null;

    void generateEncodingMap();

    String encode(String world);
}
