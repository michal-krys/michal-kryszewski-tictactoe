package com.tictactoe.game;

import java.util.*;

public class Board {

    String fieldName;
    boolean fieldValue;

    Map<String, Boolean> fields = new HashMap<>();

    public void initFields() {

        List<String> fieldNames = Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3");

        for (String fName : fieldNames) {
            this.fieldName = fName;
            this.fieldValue = false;
            fields.put(fName, fieldValue);
        }
    }

    public void insertCircle(String fieldName) throws IllegalArgumentException {

        Boolean currentValue = fields.get(fieldName);
        if (currentValue == null || currentValue) {
            throw new IllegalArgumentException();
        }
            fields.put(fieldName, true);
    }

    public void insertCross(String fieldName) throws IllegalArgumentException{

        Boolean currentValue = fields.get(fieldName);

        if (currentValue == null || currentValue) {
            throw new IllegalArgumentException();
        }
        fields.put(fieldName, true);
    }

    public boolean checkField(String fieldName) {

        Boolean currentValue = fields.get(fieldName);
        return currentValue != null && currentValue;
    }

    public String checkWinner() {
        return " ";
        /*
        jeśli pełna bez rozwiązania to remis
        albo sprawdź wynik kółek
        albo sprawdź wynik krzyżyków
         */
    }
}
