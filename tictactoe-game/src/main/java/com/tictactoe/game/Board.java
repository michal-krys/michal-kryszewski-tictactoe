package com.tictactoe.game;

import java.util.*;

public class Board {

    enum FieldValue {
        EMPTY, CIRCLE, CROSS;
    }

    enum Winner {
        CIRCLE, CROSS, TIE, NONE;
    }

    private final int gridSize;
    private final Map<String, FieldValue> fields;

    public Board(int gridSize) {
        if (gridSize != 3 && gridSize != 10) {
            throw new IllegalArgumentException("Grid must be 3 or 10");
        }
        this.gridSize = gridSize;
        this.fields = generateFields(gridSize);

    }

    private Map<String, FieldValue> generateFields(int size) {
        Map<String, FieldValue> generatedFields = new HashMap<>();
        for(char row = 'A'; row < 'A' + size; row++) {
            for (int col = 1; col <= size; col++) {
                generatedFields.put(row + String.valueOf(col), FieldValue.EMPTY);
            }
        }
        return generatedFields;
    }

    public List<String> getAvailableFields() {
        List<String> availableFields = new ArrayList<>();
        for (Map.Entry<String, FieldValue> entry : fields.entrySet()) {
            if (entry.getValue() == FieldValue.EMPTY) {
                availableFields.add(entry.getKey());
            }
        }
        return availableFields;
    }

    public void printBoard() {
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
               FieldValue fieldValue = fields.get(String.valueOf((char)('A' + row)) + String.valueOf(col + 1));

                switch (fieldValue) {
                    case CIRCLE -> System.out.print("|O|");
                    case CROSS -> System.out.print("|X|");
                    case EMPTY -> System.out.print("| |");
                }
            }
            System.out.println();
        }
    }

    public void insertCircle(String fieldName) throws IllegalArgumentException {

        if (fields.containsKey(fieldName)) {
            if (fields.get(fieldName) != FieldValue.EMPTY) {
                throw new IllegalArgumentException(fieldName + " is already taken!");
            }
            fields.put(fieldName, FieldValue.CIRCLE);
        } else {
            throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

    public void insertCross(String fieldName) throws IllegalArgumentException {

        if (fields.containsKey(fieldName)) {
            if (fields.get(fieldName) != FieldValue.EMPTY) {
                throw new IllegalArgumentException(fieldName + " is already taken!");
            }
            fields.put(fieldName, FieldValue.CROSS);
        } else {
            throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

    private boolean checkConsecutive(char startRow, int startCol, int rowIncrement, int colIncrement, int length) {

        FieldValue first = fields.get(startRow + String.valueOf(startCol));
        if (first == FieldValue.EMPTY) return false;

        for (int i = 1; i < length; i++) {
            startRow += rowIncrement;
            startCol += colIncrement;
            String fieldKey = startRow + String.valueOf(startCol);
            if (!fields.containsKey(fieldKey) || fields.get(fieldKey) != first) {
                return false;
            }
        }
        return true;
    }

    private Winner determineFiveInARowWinner(char startRow, int startCol, int rowIncrement, int colIncrement) {

        FieldValue first = fields.get(startRow + String.valueOf(startCol));
        return first == FieldValue.CIRCLE ? Winner.CIRCLE : Winner.CROSS;

    }

    public Winner checkWinner() {
        if (gridSize == 3) {
            String[][] winningCombinations = {
                    {"A1", "A2", "A3"},
                    {"B1", "B2", "B3"},
                    {"C1", "C2", "C3"},
                    {"A1", "B1", "C1"},
                    {"A2", "B2", "C2"},
                    {"A3", "B3", "C3"},
                    {"A1", "B2", "C3"},
                    {"A3", "B2", "C1"}
            };

            for (String[] combination : winningCombinations) {

                if (fields.get(combination[0]) == FieldValue.CIRCLE &&
                        fields.get(combination[1]) == FieldValue.CIRCLE &&
                        fields.get(combination[2]) == FieldValue.CIRCLE) {
                    return Winner.CIRCLE;
                } else if (fields.get(combination[0]) == FieldValue.CROSS &&
                        fields.get(combination[1]) == FieldValue.CROSS &&
                        fields.get(combination[2]) == FieldValue.CROSS) {
                    return Winner.CROSS;
                }
            }
        } else if (gridSize == 10) {

            for (int col = 1; col <= gridSize; col++) {
                for (char row = 'A'; row < 'A' + gridSize - 4; row++) {
                    if (checkConsecutive(row, col, 1, 0, 5)) {
                        return determineFiveInARowWinner(row, col, 1, 0);
                    }
                }
            }

            for (char row = 'A'; row < 'A' + gridSize - 4; row++) {
                for (int col = 1; col <= gridSize - 4; col++) {
                    if (checkConsecutive(row, col, 1, 1, 5)) {
                        return determineFiveInARowWinner(row, col, 1, 1);
                    }
                }
            }

            for (char row = 'A'; row < 'A' + gridSize - 4; row++) {
                for (int col = 5; col <= gridSize; col++) {
                    if (checkConsecutive(row, col, 1, -1, 5)) {
                        return determineFiveInARowWinner(row, col, 1, -1);
                    }
                }
            }
        }

        if (fields.values().stream()
                .noneMatch(field -> field == FieldValue.EMPTY)) {
            return Winner.TIE;
        }

        return Winner.NONE;
        }
}
