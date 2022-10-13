package com.exercise.training.cellphone.objected;

import java.util.ArrayList;
import java.util.List;

public final class Button {

    private final List<Character> letters;

    public Button(final List<Character> list) {
        this.letters = list;
    }

    public List<Character> getLetters() {
        return new ArrayList<>(letters);
    }
}
