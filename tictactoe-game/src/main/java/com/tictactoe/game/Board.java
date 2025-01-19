package com.tictactoe.game;

import java.util.*;

public class Board {

    enum FieldValue {
        EMPTY, CIRCLE, CROSS;
    }

    enum Winner {
        CIRCLE, CROSS, TIE, NONE;
    }

    Map<String, FieldValue> fields = new HashMap<>();

    public void initFields() {

        List<String> fieldNames = Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3");

        for (String fName : fieldNames) {
            fields.put(fName, FieldValue.EMPTY);
        }
    }

    public void insertCircle(String fieldName) throws IllegalArgumentException {

        if (fields.containsKey(fieldName)) {
            if (fields.get(fieldName) != FieldValue.EMPTY) {
                throw new IllegalArgumentException(fieldName + " is already taken!");
            } fields.put(fieldName, FieldValue.CIRCLE);
        } else {
            throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

    public void insertCross(String fieldName) throws IllegalArgumentException{

        if (fields.containsKey(fieldName)) {
            if (fields.get(fieldName) != FieldValue.EMPTY) {
                throw new IllegalArgumentException(fieldName + " is already taken!");
            } fields.put(fieldName, FieldValue.CROSS);
        } else {
            throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

    public Winner checkWinner() {

        if (fields.get("A1") == FieldValue.CIRCLE && fields.get("A2") == FieldValue.CIRCLE && fields.get("A3") == FieldValue.CIRCLE ||
                fields.get("B1") == FieldValue.CIRCLE && fields.get("B2") == FieldValue.CIRCLE && fields.get("B3") == FieldValue.CIRCLE ||
                fields.get("C1") == FieldValue.CIRCLE && fields.get("C2") == FieldValue.CIRCLE && fields.get("C3") == FieldValue.CIRCLE) {
            return Winner.CIRCLE;
        }

        if (fields.get("A1") == FieldValue.CROSS && fields.get("A2") == FieldValue.CROSS && fields.get("A3") == FieldValue.CROSS ||
                fields.get("B1") == FieldValue.CROSS && fields.get("B2") == FieldValue.CROSS && fields.get("B3") == FieldValue.CROSS ||
                fields.get("C1") == FieldValue.CROSS && fields.get("C2") == FieldValue.CROSS && fields.get("C3") == FieldValue.CROSS) {
            return Winner.CROSS;
        }

        if (fields.get("A1") == FieldValue.CIRCLE && fields.get("B1") == FieldValue.CIRCLE && fields.get("C1") == FieldValue.CIRCLE ||
                fields.get("A2") == FieldValue.CIRCLE && fields.get("B2") == FieldValue.CIRCLE && fields.get("C2") == FieldValue.CIRCLE ||
                fields.get("A3") == FieldValue.CIRCLE && fields.get("B3") == FieldValue.CIRCLE && fields.get("C3") == FieldValue.CIRCLE) {
            return Winner.CIRCLE;
        }

        if (fields.get("A1") == FieldValue.CROSS && fields.get("B1") == FieldValue.CROSS && fields.get("C1") == FieldValue.CROSS ||
                fields.get("A2") == FieldValue.CROSS && fields.get("B2") == FieldValue.CROSS && fields.get("C2") == FieldValue.CROSS ||
                fields.get("A3") == FieldValue.CROSS && fields.get("B3") == FieldValue.CROSS && fields.get("C3") == FieldValue.CROSS) {
            return Winner.CROSS;
        }

        if (fields.get("A1") == FieldValue.CIRCLE && fields.get("B2") == FieldValue.CIRCLE && fields.get("C3") == FieldValue.CIRCLE ||
                fields.get("A3") == FieldValue.CIRCLE && fields.get("B2") == FieldValue.CIRCLE && fields.get("C1") == FieldValue.CIRCLE) {
            return Winner.CIRCLE;
        }

        if (fields.get("A1") == FieldValue.CROSS && fields.get("B2") == FieldValue.CROSS && fields.get("C3") == FieldValue.CROSS ||
                fields.get("A3") == FieldValue.CROSS && fields.get("B2") == FieldValue.CROSS && fields.get("C1") == FieldValue.CROSS) {
            return Winner.CROSS;
        }

        if (fields.get("A1") != FieldValue.EMPTY && fields.get("A2") != FieldValue.EMPTY && fields.get("A3") != FieldValue.EMPTY &&
                fields.get("B1") != FieldValue.EMPTY && fields.get("B2") != FieldValue.EMPTY && fields.get("B3") != FieldValue.EMPTY &&
                fields.get("C1") != FieldValue.EMPTY && fields.get("C2") != FieldValue.EMPTY && fields.get("C3") != FieldValue.EMPTY) {
            return Winner.TIE;
        }
        return Winner.NONE;
    }
}
