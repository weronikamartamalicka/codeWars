package com.exercise.training.cellphone.simple;

import java.util.Map;

public class EncodingMapGenerator {

    public void generate(EncodingMap encoding) {
        encoding.generateEncodingMap();
    }

    public String encode(EncodingMap encoding, String world) {
        return encoding.encode(world);
    }
}
