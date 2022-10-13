package com.exercise.training.cellphone.objected;

import java.util.HashMap;
import java.util.Map;

public final class CellPhone {

    private final Map<String, Button> keyBoard;

    public CellPhone(final Map<String, Button> map) {
        this.keyBoard = map;
    }

    public Map<String, Button> getKeyBoard() {
        return new HashMap<>(keyBoard);
    }
}
