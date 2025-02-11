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

            String[][] winningCombinations = {
                    {"A1", "A2", "A3","A4","A5"},
                    {"A2", "A3", "A4","A5","A6"},
                    {"A3", "A4", "A5","A6","A7"},
                    {"A4", "A5", "A6","A7","A8"},
                    {"A5", "A6", "A7","A8","A9"},
                    {"A6", "A7", "A8","A9","A10"},
                    {"B1", "B2", "B3","B4","B5"},
                    {"B2", "B3", "B4","B5","B6"},
                    {"B3", "B4", "B5","B6","B7"},
                    {"B4", "B5", "B6","B7","B8"},
                    {"B5", "B6", "B7","B8","B9"},
                    {"B6", "B7", "B8","B9","B10"},
                    {"C1", "C2", "C3","C4","C5"},
                    {"C2", "C3", "C4","C5","C6"},
                    {"C3", "C4", "C5","C6","C7"},
                    {"C4", "C5", "C6","C7","C8"},
                    {"C5", "C6", "C7","C8","C9"},
                    {"C6", "C7", "C8","C9","C10"},
                    {"D1", "D2", "D3","D4","D5"},
                    {"D2", "D3", "D4","D5","D6"},
                    {"D3", "D4", "D5","D6","D7"},
                    {"D4", "D5", "D6","D7","D8"},
                    {"D5", "D6", "D7","D8","D9"},
                    {"D6", "D7", "D8","D9","D10"},
                    {"E1", "E2", "E3","E4","E5"},
                    {"E2", "E3", "E4","E5","E6"},
                    {"E3", "E4", "E5","E6","E7"},
                    {"E4", "E5", "E6","E7","E8"},
                    {"E5", "E6", "E7","E8","E9"},
                    {"E6", "E7", "E8","E9","E10"},
                    {"F1", "F2", "F3","F4","F5"},
                    {"F2", "F3", "F4","F5","F6"},
                    {"F3", "F4", "F5","F6","F7"},
                    {"F4", "F5", "F6","F7","F8"},
                    {"F5", "F6", "F7","F8","F9"},
                    {"F6", "F7", "F8","F9","F10"},
                    {"G1", "G2", "G3","G4","G5"},
                    {"G2", "G3", "G4","G5","G6"},
                    {"G3", "G4", "G5","G6","G7"},
                    {"G4", "G5", "G6","G7","G8"},
                    {"G5", "G6", "G7","G8","G9"},
                    {"G6", "G7", "G8","G9","G10"},
                    {"H1", "H2", "H3","H4","H5"},
                    {"H2", "H3", "H4","H5","H6"},
                    {"H3", "H4", "H5","H6","H7"},
                    {"H4", "H5", "H6","H7","H8"},
                    {"H5", "H6", "H7","H8","H9"},
                    {"H6", "H7", "H8","H9","H10"},
                    {"I1", "I2", "I3","I4","I5"},
                    {"I2", "I3", "I4","I5","I6"},
                    {"I3", "I4", "I5","I6","I7"},
                    {"I4", "I5", "I6","I7","I8"},
                    {"I5", "I6", "I7","I8","I9"},
                    {"I6", "I7", "I8","I9","I10"},
                    {"J1", "J2", "J3","J4","J5"},
                    {"J2", "J3", "J4","J5","J6"},
                    {"J3", "J4", "J5","J6","J7"},
                    {"J4", "J5", "J6","J7","J8"},
                    {"J5", "J6", "J7","J8","J9"},
                    {"J6", "J7", "J8","J9","J10"},
                    {"A1","B1","C1","D1","E1"},
                    {"B1","C1","D1","E1","F1"},
                    {"C1","D1","E1","F1","G1"},
                    {"D1","E1","F1","G1","H1"},
                    {"E1","F1","G1","H1","I1"},
                    {"F1","G1","H1","I1","J1"},
                    {"A2","B2","C2","D2","E2"},
                    {"B2","C2","D2","E2","F2"},
                    {"C2","D2","E2","F2","G2"},
                    {"D2","E2","F2","G2","H2"},
                    {"E2","F2","G2","H2","I2"},
                    {"F2","G2","H2","I2","J2"},
                    {"A3","B3","C3","D3","E3"},
                    {"B3","C3","D3","E3","F3"},
                    {"C3","D3","E3","F3","G3"},
                    {"D3","E3","F3","G3","H3"},
                    {"E3","F3","G3","H3","I3"},
                    {"F3","G3","H3","I3","J3"},
                    {"A4","B4","C4","D4","E4"},
                    {"B4","C4","D4","E4","F4"},
                    {"C4","D4","E4","F4","G4"},
                    {"D4","E4","F4","G4","H4"},
                    {"E4","F4","G4","H4","I4"},
                    {"F4","G4","H4","I4","J4"},
                    {"A5","B5","C5","D5","E5"},
                    {"B5","C5","D5","E5","F5"},
                    {"C5","D5","E5","F5","G5"},
                    {"D5","E5","F5","G5","H5"},
                    {"E5","F5","G5","H5","I5"},
                    {"F5","G5","H5","I5","J5"},
                    {"A6","B6","C6","D6","E6"},
                    {"B6","C6","D6","E6","F6"},
                    {"C6","D6","E6","F6","G6"},
                    {"D6","E6","F6","G6","H6"},
                    {"E6","F6","G6","H6","I6"},
                    {"F6","G6","H6","I6","J6"},
                    {"A7","B7","C7","D7","E7"},
                    {"B7","C7","D7","E7","F7"},
                    {"C7","D7","E7","F7","G7"},
                    {"D7","E7","F7","G7","H7"},
                    {"E7","F7","G7","H7","I7"},
                    {"F7","G7","H7","I7","J7"},
                    {"A8","B8","C8","D8","E8"},
                    {"B8","C8","D8","E8","F8"},
                    {"C8","D8","E8","F8","G8"},
                    {"D8","E8","F8","G8","H8"},
                    {"E8","F8","G8","H8","I8"},
                    {"F8","G8","H8","I8","J8"},
                    {"A9","B9","C9","D9","E9"},
                    {"B9","C9","D9","E9","F9"},
                    {"C9","D9","E9","F9","G9"},
                    {"D9","E9","F9","G9","H9"},
                    {"E9","F9","G9","H9","I9"},
                    {"F9","G9","H9","I9","J9"},
                    {"A10","B10","C10","D10","E10"},
                    {"B10","C10","D10","E10","F10"},
                    {"C10","D10","E10","F10","G10"},
                    {"D10","E10","F10","G10","H10"},
                    {"E10","F10","G10","H10","I10"},
                    {"F10","G10","H10","I10","J10"},
                    {"A1", "B2", "C3", "D4", "E5"},
                    {"A2", "B3", "C4", "D5", "E6"},
                    {"A3", "B4", "C5", "D6", "E7"},
                    {"A4", "B5", "C6", "D7", "E8"},
                    {"A5", "B6", "C7", "D8", "E9"},
                    {"A6", "B7", "C8", "D9", "E10"},
                    {"B1", "C2", "D3", "E4", "F5"},
                    {"B2", "C3", "D4", "E5", "F6"},
                    {"B3", "C4", "D5", "E6", "F7"},
                    {"B4", "C5", "D6", "E7", "F8"},
                    {"B5", "C6", "D7", "E8", "F9"},
                    {"B6", "C7", "D8", "E9", "F10"},
                    {"C1", "D2", "E3", "F4", "G5"},
                    {"C2", "D3", "E4", "F5", "G6"},
                    {"C3", "D4", "E5", "F6", "G7"},
                    {"C4", "D5", "E6", "F7", "G8"},
                    {"C5", "D6", "E7", "F8", "G9"},
                    {"C6", "D7", "E8", "F9", "G10"},
                    {"D1", "E2", "F3", "G4", "H5"},
                    {"D2", "E3", "F4", "G5", "H6"},
                    {"D3", "E4", "F5", "G6", "H7"},
                    {"D4", "E5", "F6", "G7", "H8"},
                    {"D5", "E6", "F7", "G8", "H9"},
                    {"D6", "E7", "F8", "G9", "H10"},
                    {"E1", "F2", "G3", "H4", "I5"},
                    {"E2", "F3", "G4", "H5", "I6"},
                    {"E3", "F4", "G5", "H6", "I7"},
                    {"E4", "F5", "G6", "H7", "I8"},
                    {"E5", "F6", "G7", "H8", "I9"},
                    {"E6", "F7", "G8", "H9", "I10"},
                    {"F1", "G2", "H3", "I4", "J5"},
                    {"F2", "G3", "H4", "I5", "J6"},
                    {"F3", "G4", "H5", "I6", "J7"},
                    {"F4", "G5", "H6", "I7", "J8"},
                    {"F5", "G6", "H7", "I8", "J9"},
                    {"F6", "G7", "H8", "I9", "J10"},
                    {"J1", "I2", "H3", "G4", "F5"},
                    {"I1", "H2", "G3", "F4", "E5"},
                    {"H1", "G2", "F3", "E4", "D5"},
                    {"G1", "F2", "E3", "D4", "C5"},
                    {"F1", "E2", "D3", "C4", "B5"},
                    {"E1", "D2", "C3", "B4", "A5"},
                    {"J2", "I3", "H4", "G5", "F6"},
                    {"I2", "H3", "G4", "F5", "E6"},
                    {"H2", "G3", "F4", "E5", "D6"},
                    {"G2", "F3", "E4", "D5", "C6"},
                    {"F2", "E3", "D4", "C5", "B6"},
                    {"E2", "D3", "C4", "B5", "A6"},
                    {"J3", "I4", "H5", "G6", "F7"},
                    {"I3", "H4", "G5", "F6", "E7"},
                    {"H3", "G4", "F5", "E6", "D7"},
                    {"G3", "F4", "E5", "D6", "C7"},
                    {"F3", "E4", "D5", "C6", "B7"},
                    {"E3", "D4", "C5", "B6", "A7"},
                    {"J4", "I5", "H6", "G7", "F8"},
                    {"I4", "H5", "G6", "F7", "E8"},
                    {"H4", "G5", "F6", "E7", "D8"},
                    {"G4", "F5", "E6", "D7", "C8"},
                    {"F4", "E5", "D6", "C7", "B8"},
                    {"E4", "D5", "C6", "B7", "A8"},
                    {"J5", "I6", "H7", "G8", "F9"},
                    {"I5", "H6", "G7", "F8", "E9"},
                    {"H5", "G6", "F7", "E8", "D9"},
                    {"G5", "F6", "E7", "D8", "C9"},
                    {"F5", "E6", "D7", "C8", "B9"},
                    {"E5", "D6", "C7", "B8", "A9"},
                    {"J6", "I7", "H8", "G9", "F10"},
                    {"I6", "H7", "G8", "F9", "E10"},
                    {"H6", "G7", "F8", "E9", "D10"},
                    {"G6", "F7", "E8", "D9", "C10"},
                    {"F6", "E7", "D8", "C9", "B10"},
                    {"E6", "D7", "C8", "B9", "A10"}
            };

            for (String[] combination : winningCombinations) {

                if (fields.get(combination[0]) == FieldValue.CIRCLE &&
                        fields.get(combination[1]) == FieldValue.CIRCLE &&
                        fields.get(combination[2]) == FieldValue.CIRCLE &&
                        fields.get(combination[3]) == FieldValue.CIRCLE &&
                        fields.get(combination[4]) == FieldValue.CIRCLE) {
                    return Winner.CIRCLE;
                } else if (fields.get(combination[0]) == FieldValue.CROSS &&
                        fields.get(combination[1]) == FieldValue.CROSS &&
                        fields.get(combination[2]) == FieldValue.CROSS &&
                        fields.get(combination[3]) == FieldValue.CROSS &&
                        fields.get(combination[4]) == FieldValue.CROSS){
                    return Winner.CROSS;
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
