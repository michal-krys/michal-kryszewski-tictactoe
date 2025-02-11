package com.tictactoe.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Board10TestSuite {

    static final int size = 10;
    Board board = new Board(size);

    @Test
    void testInsertCrossFreeField() {
        //when&then
        assertDoesNotThrow(() -> board.insertCross("A1"));
        assertDoesNotThrow(() -> board.insertCross("A2"));
        assertDoesNotThrow(() -> board.insertCross("A3"));
        assertDoesNotThrow(() -> board.insertCross("A4"));
        assertDoesNotThrow(() -> board.insertCross("A5"));
        assertDoesNotThrow(() -> board.insertCross("A6"));
        assertDoesNotThrow(() -> board.insertCross("A7"));
        assertDoesNotThrow(() -> board.insertCross("A8"));
        assertDoesNotThrow(() -> board.insertCross("A9"));
        assertDoesNotThrow(() -> board.insertCross("A10"));
        assertDoesNotThrow(() -> board.insertCross("B1"));
        assertDoesNotThrow(() -> board.insertCross("B2"));
        assertDoesNotThrow(() -> board.insertCross("B3"));
        assertDoesNotThrow(() -> board.insertCross("B4"));
        assertDoesNotThrow(() -> board.insertCross("B5"));
        assertDoesNotThrow(() -> board.insertCross("B6"));
        assertDoesNotThrow(() -> board.insertCross("B7"));
        assertDoesNotThrow(() -> board.insertCross("B8"));
        assertDoesNotThrow(() -> board.insertCross("B9"));
        assertDoesNotThrow(() -> board.insertCross("B10"));
        assertDoesNotThrow(() -> board.insertCross("C1"));
        assertDoesNotThrow(() -> board.insertCross("C2"));
        assertDoesNotThrow(() -> board.insertCross("C3"));
        assertDoesNotThrow(() -> board.insertCross("C4"));
        assertDoesNotThrow(() -> board.insertCross("C5"));
        assertDoesNotThrow(() -> board.insertCross("C6"));
        assertDoesNotThrow(() -> board.insertCross("C7"));
        assertDoesNotThrow(() -> board.insertCross("C8"));
        assertDoesNotThrow(() -> board.insertCross("C9"));
        assertDoesNotThrow(() -> board.insertCross("C10"));
        assertDoesNotThrow(() -> board.insertCross("D1"));
        assertDoesNotThrow(() -> board.insertCross("D2"));
        assertDoesNotThrow(() -> board.insertCross("D3"));
        assertDoesNotThrow(() -> board.insertCross("D4"));
        assertDoesNotThrow(() -> board.insertCross("D5"));
        assertDoesNotThrow(() -> board.insertCross("D6"));
        assertDoesNotThrow(() -> board.insertCross("D7"));
        assertDoesNotThrow(() -> board.insertCross("D8"));
        assertDoesNotThrow(() -> board.insertCross("D9"));
        assertDoesNotThrow(() -> board.insertCross("D10"));
        assertDoesNotThrow(() -> board.insertCross("E1"));
        assertDoesNotThrow(() -> board.insertCross("E2"));
        assertDoesNotThrow(() -> board.insertCross("E3"));
        assertDoesNotThrow(() -> board.insertCross("E4"));
        assertDoesNotThrow(() -> board.insertCross("E5"));
        assertDoesNotThrow(() -> board.insertCross("E6"));
        assertDoesNotThrow(() -> board.insertCross("E7"));
        assertDoesNotThrow(() -> board.insertCross("E8"));
        assertDoesNotThrow(() -> board.insertCross("E9"));
        assertDoesNotThrow(() -> board.insertCross("E10"));
        assertDoesNotThrow(() -> board.insertCross("F1"));
        assertDoesNotThrow(() -> board.insertCross("F2"));
        assertDoesNotThrow(() -> board.insertCross("F3"));
        assertDoesNotThrow(() -> board.insertCross("F4"));
        assertDoesNotThrow(() -> board.insertCross("F5"));
        assertDoesNotThrow(() -> board.insertCross("F6"));
        assertDoesNotThrow(() -> board.insertCross("F7"));
        assertDoesNotThrow(() -> board.insertCross("F8"));
        assertDoesNotThrow(() -> board.insertCross("F9"));
        assertDoesNotThrow(() -> board.insertCross("F10"));
        assertDoesNotThrow(() -> board.insertCross("G1"));
        assertDoesNotThrow(() -> board.insertCross("G2"));
        assertDoesNotThrow(() -> board.insertCross("G3"));
        assertDoesNotThrow(() -> board.insertCross("G4"));
        assertDoesNotThrow(() -> board.insertCross("G5"));
        assertDoesNotThrow(() -> board.insertCross("G6"));
        assertDoesNotThrow(() -> board.insertCross("G7"));
        assertDoesNotThrow(() -> board.insertCross("G8"));
        assertDoesNotThrow(() -> board.insertCross("G9"));
        assertDoesNotThrow(() -> board.insertCross("G10"));
        assertDoesNotThrow(() -> board.insertCross("H1"));
        assertDoesNotThrow(() -> board.insertCross("H2"));
        assertDoesNotThrow(() -> board.insertCross("H3"));
        assertDoesNotThrow(() -> board.insertCross("H4"));
        assertDoesNotThrow(() -> board.insertCross("H5"));
        assertDoesNotThrow(() -> board.insertCross("H6"));
        assertDoesNotThrow(() -> board.insertCross("H7"));
        assertDoesNotThrow(() -> board.insertCross("H8"));
        assertDoesNotThrow(() -> board.insertCross("H9"));
        assertDoesNotThrow(() -> board.insertCross("H10"));
        assertDoesNotThrow(() -> board.insertCross("I1"));
        assertDoesNotThrow(() -> board.insertCross("I2"));
        assertDoesNotThrow(() -> board.insertCross("I3"));
        assertDoesNotThrow(() -> board.insertCross("I4"));
        assertDoesNotThrow(() -> board.insertCross("I5"));
        assertDoesNotThrow(() -> board.insertCross("I6"));
        assertDoesNotThrow(() -> board.insertCross("I7"));
        assertDoesNotThrow(() -> board.insertCross("I8"));
        assertDoesNotThrow(() -> board.insertCross("I9"));
        assertDoesNotThrow(() -> board.insertCross("I10"));
        assertDoesNotThrow(() -> board.insertCross("J1"));
        assertDoesNotThrow(() -> board.insertCross("J2"));
        assertDoesNotThrow(() -> board.insertCross("J3"));
        assertDoesNotThrow(() -> board.insertCross("J4"));
        assertDoesNotThrow(() -> board.insertCross("J5"));
        assertDoesNotThrow(() -> board.insertCross("J6"));
        assertDoesNotThrow(() -> board.insertCross("J7"));
        assertDoesNotThrow(() -> board.insertCross("J8"));
        assertDoesNotThrow(() -> board.insertCross("J9"));
        assertDoesNotThrow(() -> board.insertCross("J10"));
    }

    @Test
    void testInsertCrossOccupiedField() {
    //when
        board.insertCross("A1");
        board.insertCircle("A2");
        board.insertCross("A3");
        board.insertCircle("A4");
        board.insertCross("A5");
        board.insertCircle("A6");
        board.insertCross("A7");
        board.insertCircle("A8");
        board.insertCross("A9");
        board.insertCircle("A10");
        board.insertCross("B1");
        board.insertCircle("B2");
        board.insertCross("B3");
        board.insertCircle("B4");
        board.insertCross("B5");
        board.insertCircle("B6");
        board.insertCross("B7");
        board.insertCircle("B8");
        board.insertCross("B9");
        board.insertCircle("B10");
        board.insertCross("C1");
        board.insertCircle("C2");
        board.insertCross("C3");
        board.insertCircle("C4");
        board.insertCross("C5");
        board.insertCircle("C6");
        board.insertCross("C7");
        board.insertCircle("C8");
        board.insertCross("C9");
        board.insertCircle("C10");
        board.insertCross("D1");
        board.insertCircle("D2");
        board.insertCross("D3");
        board.insertCircle("D4");
        board.insertCross("D5");
        board.insertCircle("D6");
        board.insertCross("D7");
        board.insertCircle("D8");
        board.insertCross("D9");
        board.insertCircle("D10");
        board.insertCross("E1");
        board.insertCircle("E2");
        board.insertCross("E3");
        board.insertCircle("E4");
        board.insertCross("E5");
        board.insertCircle("E6");
        board.insertCross("E7");
        board.insertCircle("E8");
        board.insertCross("E9");
        board.insertCircle("E10");
        board.insertCross("F1");
        board.insertCircle("F2");
        board.insertCross("F3");
        board.insertCircle("F4");
        board.insertCross("F5");
        board.insertCircle("F6");
        board.insertCross("F7");
        board.insertCircle("F8");
        board.insertCross("F9");
        board.insertCircle("F10");
        board.insertCross("G1");
        board.insertCircle("G2");
        board.insertCross("G3");
        board.insertCircle("G4");
        board.insertCross("G5");
        board.insertCircle("G6");
        board.insertCross("G7");
        board.insertCircle("G8");
        board.insertCross("G9");
        board.insertCircle("G10");
        board.insertCross("H1");
        board.insertCircle("H2");
        board.insertCross("H3");
        board.insertCircle("H4");
        board.insertCross("H5");
        board.insertCircle("H6");
        board.insertCross("H7");
        board.insertCircle("H8");
        board.insertCross("H9");
        board.insertCircle("H10");
        board.insertCross("I1");
        board.insertCircle("I2");
        board.insertCross("I3");
        board.insertCircle("I4");
        board.insertCross("I5");
        board.insertCircle("I6");
        board.insertCross("I7");
        board.insertCircle("I8");
        board.insertCross("I9");
        board.insertCircle("I10");
        board.insertCross("J1");
        board.insertCircle("J2");
        board.insertCross("J3");
        board.insertCircle("J4");
        board.insertCross("J5");
        board.insertCircle("J6");
        board.insertCross("J7");
        board.insertCircle("J8");
        board.insertCross("J9");
        board.insertCircle("J10");
        
        //then
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("D10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("E10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("F10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("G10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("H10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("I10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("J10"));
    }

    @Test
    void testInsertCircleFreeField() {
    //when&then
        assertDoesNotThrow(() -> board.insertCircle("A1"));
        assertDoesNotThrow(() -> board.insertCircle("A2"));
        assertDoesNotThrow(() -> board.insertCircle("A3"));
        assertDoesNotThrow(() -> board.insertCircle("A4"));
        assertDoesNotThrow(() -> board.insertCircle("A5"));
        assertDoesNotThrow(() -> board.insertCircle("A6"));
        assertDoesNotThrow(() -> board.insertCircle("A7"));
        assertDoesNotThrow(() -> board.insertCircle("A8"));
        assertDoesNotThrow(() -> board.insertCircle("A9"));
        assertDoesNotThrow(() -> board.insertCircle("A10"));
        assertDoesNotThrow(() -> board.insertCircle("B1"));
        assertDoesNotThrow(() -> board.insertCircle("B2"));
        assertDoesNotThrow(() -> board.insertCircle("B3"));
        assertDoesNotThrow(() -> board.insertCircle("B4"));
        assertDoesNotThrow(() -> board.insertCircle("B5"));
        assertDoesNotThrow(() -> board.insertCircle("B6"));
        assertDoesNotThrow(() -> board.insertCircle("B7"));
        assertDoesNotThrow(() -> board.insertCircle("B8"));
        assertDoesNotThrow(() -> board.insertCircle("B9"));
        assertDoesNotThrow(() -> board.insertCircle("B10"));
        assertDoesNotThrow(() -> board.insertCircle("C1"));
        assertDoesNotThrow(() -> board.insertCircle("C2"));
        assertDoesNotThrow(() -> board.insertCircle("C3"));
        assertDoesNotThrow(() -> board.insertCircle("C4"));
        assertDoesNotThrow(() -> board.insertCircle("C5"));
        assertDoesNotThrow(() -> board.insertCircle("C6"));
        assertDoesNotThrow(() -> board.insertCircle("C7"));
        assertDoesNotThrow(() -> board.insertCircle("C8"));
        assertDoesNotThrow(() -> board.insertCircle("C9"));
        assertDoesNotThrow(() -> board.insertCircle("C10"));
        assertDoesNotThrow(() -> board.insertCircle("D1"));
        assertDoesNotThrow(() -> board.insertCircle("D2"));
        assertDoesNotThrow(() -> board.insertCircle("D3"));
        assertDoesNotThrow(() -> board.insertCircle("D4"));
        assertDoesNotThrow(() -> board.insertCircle("D5"));
        assertDoesNotThrow(() -> board.insertCircle("D6"));
        assertDoesNotThrow(() -> board.insertCircle("D7"));
        assertDoesNotThrow(() -> board.insertCircle("D8"));
        assertDoesNotThrow(() -> board.insertCircle("D9"));
        assertDoesNotThrow(() -> board.insertCircle("D10"));
        assertDoesNotThrow(() -> board.insertCircle("E1"));
        assertDoesNotThrow(() -> board.insertCircle("E2"));
        assertDoesNotThrow(() -> board.insertCircle("E3"));
        assertDoesNotThrow(() -> board.insertCircle("E4"));
        assertDoesNotThrow(() -> board.insertCircle("E5"));
        assertDoesNotThrow(() -> board.insertCircle("E6"));
        assertDoesNotThrow(() -> board.insertCircle("E7"));
        assertDoesNotThrow(() -> board.insertCircle("E8"));
        assertDoesNotThrow(() -> board.insertCircle("E9"));
        assertDoesNotThrow(() -> board.insertCircle("E10"));
        assertDoesNotThrow(() -> board.insertCircle("F1"));
        assertDoesNotThrow(() -> board.insertCircle("F2"));
        assertDoesNotThrow(() -> board.insertCircle("F3"));
        assertDoesNotThrow(() -> board.insertCircle("F4"));
        assertDoesNotThrow(() -> board.insertCircle("F5"));
        assertDoesNotThrow(() -> board.insertCircle("F6"));
        assertDoesNotThrow(() -> board.insertCircle("F7"));
        assertDoesNotThrow(() -> board.insertCircle("F8"));
        assertDoesNotThrow(() -> board.insertCircle("F9"));
        assertDoesNotThrow(() -> board.insertCircle("F10"));
        assertDoesNotThrow(() -> board.insertCircle("G1"));
        assertDoesNotThrow(() -> board.insertCircle("G2"));
        assertDoesNotThrow(() -> board.insertCircle("G3"));
        assertDoesNotThrow(() -> board.insertCircle("G4"));
        assertDoesNotThrow(() -> board.insertCircle("G5"));
        assertDoesNotThrow(() -> board.insertCircle("G6"));
        assertDoesNotThrow(() -> board.insertCircle("G7"));
        assertDoesNotThrow(() -> board.insertCircle("G8"));
        assertDoesNotThrow(() -> board.insertCircle("G9"));
        assertDoesNotThrow(() -> board.insertCircle("G10"));
        assertDoesNotThrow(() -> board.insertCircle("H1"));
        assertDoesNotThrow(() -> board.insertCircle("H2"));
        assertDoesNotThrow(() -> board.insertCircle("H3"));
        assertDoesNotThrow(() -> board.insertCircle("H4"));
        assertDoesNotThrow(() -> board.insertCircle("H5"));
        assertDoesNotThrow(() -> board.insertCircle("H6"));
        assertDoesNotThrow(() -> board.insertCircle("H7"));
        assertDoesNotThrow(() -> board.insertCircle("H8"));
        assertDoesNotThrow(() -> board.insertCircle("H9"));
        assertDoesNotThrow(() -> board.insertCircle("H10"));
        assertDoesNotThrow(() -> board.insertCircle("I1"));
        assertDoesNotThrow(() -> board.insertCircle("I2"));
        assertDoesNotThrow(() -> board.insertCircle("I3"));
        assertDoesNotThrow(() -> board.insertCircle("I4"));
        assertDoesNotThrow(() -> board.insertCircle("I5"));
        assertDoesNotThrow(() -> board.insertCircle("I6"));
        assertDoesNotThrow(() -> board.insertCircle("I7"));
        assertDoesNotThrow(() -> board.insertCircle("I8"));
        assertDoesNotThrow(() -> board.insertCircle("I9"));
        assertDoesNotThrow(() -> board.insertCircle("I10"));
        assertDoesNotThrow(() -> board.insertCircle("J1"));
        assertDoesNotThrow(() -> board.insertCircle("J2"));
        assertDoesNotThrow(() -> board.insertCircle("J3"));
        assertDoesNotThrow(() -> board.insertCircle("J4"));
        assertDoesNotThrow(() -> board.insertCircle("J5"));
        assertDoesNotThrow(() -> board.insertCircle("J6"));
        assertDoesNotThrow(() -> board.insertCircle("J7"));
        assertDoesNotThrow(() -> board.insertCircle("J8"));
        assertDoesNotThrow(() -> board.insertCircle("J9"));
        assertDoesNotThrow(() -> board.insertCircle("J10"));
    }

    @Test
    void testInsertCircleOccupiedField() {
    //when
        board.insertCross("A1");
        board.insertCircle("A2");
        board.insertCross("A3");
        board.insertCircle("A4");
        board.insertCross("A5");
        board.insertCircle("A6");
        board.insertCross("A7");
        board.insertCircle("A8");
        board.insertCross("A9");
        board.insertCircle("A10");
        board.insertCross("B1");
        board.insertCircle("B2");
        board.insertCross("B3");
        board.insertCircle("B4");
        board.insertCross("B5");
        board.insertCircle("B6");
        board.insertCross("B7");
        board.insertCircle("B8");
        board.insertCross("B9");
        board.insertCircle("B10");
        board.insertCross("C1");
        board.insertCircle("C2");
        board.insertCross("C3");
        board.insertCircle("C4");
        board.insertCross("C5");
        board.insertCircle("C6");
        board.insertCross("C7");
        board.insertCircle("C8");
        board.insertCross("C9");
        board.insertCircle("C10");
        board.insertCross("D1");
        board.insertCircle("D2");
        board.insertCross("D3");
        board.insertCircle("D4");
        board.insertCross("D5");
        board.insertCircle("D6");
        board.insertCross("D7");
        board.insertCircle("D8");
        board.insertCross("D9");
        board.insertCircle("D10");
        board.insertCross("E1");
        board.insertCircle("E2");
        board.insertCross("E3");
        board.insertCircle("E4");
        board.insertCross("E5");
        board.insertCircle("E6");
        board.insertCross("E7");
        board.insertCircle("E8");
        board.insertCross("E9");
        board.insertCircle("E10");
        board.insertCross("F1");
        board.insertCircle("F2");
        board.insertCross("F3");
        board.insertCircle("F4");
        board.insertCross("F5");
        board.insertCircle("F6");
        board.insertCross("F7");
        board.insertCircle("F8");
        board.insertCross("F9");
        board.insertCircle("F10");
        board.insertCross("G1");
        board.insertCircle("G2");
        board.insertCross("G3");
        board.insertCircle("G4");
        board.insertCross("G5");
        board.insertCircle("G6");
        board.insertCross("G7");
        board.insertCircle("G8");
        board.insertCross("G9");
        board.insertCircle("G10");
        board.insertCross("H1");
        board.insertCircle("H2");
        board.insertCross("H3");
        board.insertCircle("H4");
        board.insertCross("H5");
        board.insertCircle("H6");
        board.insertCross("H7");
        board.insertCircle("H8");
        board.insertCross("H9");
        board.insertCircle("H10");
        board.insertCross("I1");
        board.insertCircle("I2");
        board.insertCross("I3");
        board.insertCircle("I4");
        board.insertCross("I5");
        board.insertCircle("I6");
        board.insertCross("I7");
        board.insertCircle("I8");
        board.insertCross("I9");
        board.insertCircle("I10");
        board.insertCross("J1");
        board.insertCircle("J2");
        board.insertCross("J3");
        board.insertCircle("J4");
        board.insertCross("J5");
        board.insertCircle("J6");
        board.insertCross("J7");
        board.insertCircle("J8");
        board.insertCross("J9");
        board.insertCircle("J10");

        //then
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("D10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("E10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("F10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("G10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("H10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("I10"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J4"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J5"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J6"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J7"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J8"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J9"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("J10"));
    }
        

    @Test
    void testCircleA1RowWins() {
        //when
        board.insertCircle("A1");
        board.insertCircle("A2");
        board.insertCircle("A3");
        board.insertCircle("A4");
        board.insertCircle("A5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleA2RowWins() {
        //when
        board.insertCircle("A2");
        board.insertCircle("A3");
        board.insertCircle("A4");
        board.insertCircle("A5");
        board.insertCircle("A6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleA3RowWins() {
        //when
        board.insertCircle("A3");
        board.insertCircle("A4");
        board.insertCircle("A5");
        board.insertCircle("A6");
        board.insertCircle("A7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleA4RowWins() {
        //when
        board.insertCircle("A4");
        board.insertCircle("A5");
        board.insertCircle("A6");
        board.insertCircle("A7");
        board.insertCircle("A8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleA5RowWins() {
        //when
        board.insertCircle("A5");
        board.insertCircle("A6");
        board.insertCircle("A7");
        board.insertCircle("A8");
        board.insertCircle("A9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleA6RowWins() {

        //when
        board.insertCircle("A6");
        board.insertCircle("A7");
        board.insertCircle("A8");
        board.insertCircle("A9");
        board.insertCircle("A10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB1RowWins() {
        //when
        board.insertCircle("B1");
        board.insertCircle("B2");
        board.insertCircle("B3");
        board.insertCircle("B4");
        board.insertCircle("B5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB2RowWins() {
        //when
        board.insertCircle("B2");
        board.insertCircle("B3");
        board.insertCircle("B4");
        board.insertCircle("B5");
        board.insertCircle("B6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB3RowWins() {
        //when
        board.insertCircle("B3");
        board.insertCircle("B4");
        board.insertCircle("B5");
        board.insertCircle("B6");
        board.insertCircle("B7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB4RowWins() {
        //when
        board.insertCircle("B4");
        board.insertCircle("B5");
        board.insertCircle("B6");
        board.insertCircle("B7");
        board.insertCircle("B8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB5RowWins() {
        //when
        board.insertCircle("B5");
        board.insertCircle("B6");
        board.insertCircle("B7");
        board.insertCircle("B8");
        board.insertCircle("B9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleB6RowWins() {
        //when
        board.insertCircle("B6");
        board.insertCircle("B7");
        board.insertCircle("B8");
        board.insertCircle("B9");
        board.insertCircle("B10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC1RowWins() {
        //when
        board.insertCircle("C1");
        board.insertCircle("C2");
        board.insertCircle("C3");
        board.insertCircle("C4");
        board.insertCircle("C5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC2RowWins() {
        //when
        board.insertCircle("C2");
        board.insertCircle("C3");
        board.insertCircle("C4");
        board.insertCircle("C5");
        board.insertCircle("C6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC3RowWins() {
        //when
        board.insertCircle("C3");
        board.insertCircle("C4");
        board.insertCircle("C5");
        board.insertCircle("C6");
        board.insertCircle("C7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC4RowWins() {
        //when
        board.insertCircle("C4");
        board.insertCircle("C5");
        board.insertCircle("C6");
        board.insertCircle("C7");
        board.insertCircle("C8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC5RowWins() {
        //when
        board.insertCircle("C5");
        board.insertCircle("C6");
        board.insertCircle("C7");
        board.insertCircle("C8");
        board.insertCircle("C9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleC6RowWins() {
        //when
        board.insertCircle("C6");
        board.insertCircle("C7");
        board.insertCircle("C8");
        board.insertCircle("C9");
        board.insertCircle("C10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD1RowWins() {
        //when
        board.insertCircle("D1");
        board.insertCircle("D2");
        board.insertCircle("D3");
        board.insertCircle("D4");
        board.insertCircle("D5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD2RowWins() {
        //when
        board.insertCircle("D2");
        board.insertCircle("D3");
        board.insertCircle("D4");
        board.insertCircle("D5");
        board.insertCircle("D6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD3RowWins() {
        //when
        board.insertCircle("D3");
        board.insertCircle("D4");
        board.insertCircle("D5");
        board.insertCircle("D6");
        board.insertCircle("D7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD4RowWins() {
        //when
        board.insertCircle("D4");
        board.insertCircle("D5");
        board.insertCircle("D6");
        board.insertCircle("D7");
        board.insertCircle("D8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD5RowWins() {
        //when
        board.insertCircle("D5");
        board.insertCircle("D6");
        board.insertCircle("D7");
        board.insertCircle("D8");
        board.insertCircle("D9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleD6RowWins() {
        //when
        board.insertCircle("D6");
        board.insertCircle("D7");
        board.insertCircle("D8");
        board.insertCircle("D9");
        board.insertCircle("D10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE1RowWins() {
        //when
        board.insertCircle("E1");
        board.insertCircle("E2");
        board.insertCircle("E3");
        board.insertCircle("E4");
        board.insertCircle("E5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE2RowWins() {
        //when
        board.insertCircle("E2");
        board.insertCircle("E3");
        board.insertCircle("E4");
        board.insertCircle("E5");
        board.insertCircle("E6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE3RowWins() {
        //when
        board.insertCircle("E3");
        board.insertCircle("E4");
        board.insertCircle("E5");
        board.insertCircle("E6");
        board.insertCircle("E7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE4RowWins() {
        //when
        board.insertCircle("E4");
        board.insertCircle("E5");
        board.insertCircle("E6");
        board.insertCircle("E7");
        board.insertCircle("E8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE5RowWins() {
        //when
        board.insertCircle("E5");
        board.insertCircle("E6");
        board.insertCircle("E7");
        board.insertCircle("E8");
        board.insertCircle("E9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleE6RowWins() {
        //when
        board.insertCircle("E6");
        board.insertCircle("E7");
        board.insertCircle("E8");
        board.insertCircle("E9");
        board.insertCircle("E10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleF2RowWins() {
        //when
        board.insertCircle("F2");
        board.insertCircle("F3");
        board.insertCircle("F4");
        board.insertCircle("F5");
        board.insertCircle("F6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleF3RowWins() {
        //when
        board.insertCircle("F3");
        board.insertCircle("F4");
        board.insertCircle("F5");
        board.insertCircle("F6");
        board.insertCircle("F7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleF4RowWins() {
        //when
        board.insertCircle("F4");
        board.insertCircle("F5");
        board.insertCircle("F6");
        board.insertCircle("F7");
        board.insertCircle("F8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleF5RowWins() {
        //when
        board.insertCircle("F5");
        board.insertCircle("F6");
        board.insertCircle("F7");
        board.insertCircle("F8");
        board.insertCircle("F9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleF6RowWins() {
        //when
        board.insertCircle("F6");
        board.insertCircle("F7");
        board.insertCircle("F8");
        board.insertCircle("F9");
        board.insertCircle("F10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG1RowWins() {
        //when
        board.insertCircle("G1");
        board.insertCircle("G2");
        board.insertCircle("G3");
        board.insertCircle("G4");
        board.insertCircle("G5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG2RowWins() {
        //when
        board.insertCircle("G2");
        board.insertCircle("G3");
        board.insertCircle("G4");
        board.insertCircle("G5");
        board.insertCircle("G6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG3RowWins() {
        //when
        board.insertCircle("G3");
        board.insertCircle("G4");
        board.insertCircle("G5");
        board.insertCircle("G6");
        board.insertCircle("G7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG4RowWins() {
        //when
        board.insertCircle("G4");
        board.insertCircle("G5");
        board.insertCircle("G6");
        board.insertCircle("G7");
        board.insertCircle("G8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG5RowWins() {
        //when
        board.insertCircle("G5");
        board.insertCircle("G6");
        board.insertCircle("G7");
        board.insertCircle("G8");
        board.insertCircle("G9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleG6RowWins() {
        //when
        board.insertCircle("G6");
        board.insertCircle("G7");
        board.insertCircle("G8");
        board.insertCircle("G9");
        board.insertCircle("G10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH1RowWins() {
        //when
        board.insertCircle("H1");
        board.insertCircle("H2");
        board.insertCircle("H3");
        board.insertCircle("H4");
        board.insertCircle("H5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH2RowWins() {
        //when
        board.insertCircle("H2");
        board.insertCircle("H3");
        board.insertCircle("H4");
        board.insertCircle("H5");
        board.insertCircle("H6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH3RowWins() {
        //when
        board.insertCircle("H3");
        board.insertCircle("H4");
        board.insertCircle("H5");
        board.insertCircle("H6");
        board.insertCircle("H7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH4RowWins() {
        //when
        board.insertCircle("H4");
        board.insertCircle("H5");
        board.insertCircle("H6");
        board.insertCircle("H7");
        board.insertCircle("H8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH5RowWins() {
        //when
        board.insertCircle("H5");
        board.insertCircle("H6");
        board.insertCircle("H7");
        board.insertCircle("H8");
        board.insertCircle("H9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleH6RowWins() {
        //when
        board.insertCircle("H6");
        board.insertCircle("H7");
        board.insertCircle("H8");
        board.insertCircle("H9");
        board.insertCircle("H10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI1RowWins() {
        //when
        board.insertCircle("I1");
        board.insertCircle("I2");
        board.insertCircle("I3");
        board.insertCircle("I4");
        board.insertCircle("I5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI2RowWins() {
        //when
        board.insertCircle("I2");
        board.insertCircle("I3");
        board.insertCircle("I4");
        board.insertCircle("I5");
        board.insertCircle("I6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI3RowWins() {
        //when
        board.insertCircle("I3");
        board.insertCircle("I4");
        board.insertCircle("I5");
        board.insertCircle("I6");
        board.insertCircle("I7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI4RowWins() {
        //when
        board.insertCircle("I4");
        board.insertCircle("I5");
        board.insertCircle("I6");
        board.insertCircle("I7");
        board.insertCircle("I8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI5RowWins() {
        //when
        board.insertCircle("I5");
        board.insertCircle("I6");
        board.insertCircle("I7");
        board.insertCircle("I8");
        board.insertCircle("I9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleI6RowWins() {
        //when
        board.insertCircle("I6");
        board.insertCircle("I7");
        board.insertCircle("I8");
        board.insertCircle("I9");
        board.insertCircle("I10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ1RowWins() {
        //when
        board.insertCircle("J1");
        board.insertCircle("J2");
        board.insertCircle("J3");
        board.insertCircle("J4");
        board.insertCircle("J5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ2RowWins() {
        //when
        board.insertCircle("J2");
        board.insertCircle("J3");
        board.insertCircle("J4");
        board.insertCircle("J5");
        board.insertCircle("J6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ3RowWins() {
        //when
        board.insertCircle("J3");
        board.insertCircle("J4");
        board.insertCircle("J5");
        board.insertCircle("J6");
        board.insertCircle("J7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ4RowWins() {
        //when
        board.insertCircle("J4");
        board.insertCircle("J5");
        board.insertCircle("J6");
        board.insertCircle("J7");
        board.insertCircle("J8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ5RowWins() {
        //when
        board.insertCircle("J5");
        board.insertCircle("J6");
        board.insertCircle("J7");
        board.insertCircle("J8");
        board.insertCircle("J9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleJ6RowWins() {
        //when
        board.insertCircle("J6");
        board.insertCircle("J7");
        board.insertCircle("J8");
        board.insertCircle("J9");
        board.insertCircle("J10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle11ColumnWins() {
        //when
        board.insertCircle("A1");
        board.insertCircle("B1");
        board.insertCircle("C1");
        board.insertCircle("D1");
        board.insertCircle("E1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle12ColumnWins() {
        //when
        board.insertCircle("B1");
        board.insertCircle("C1");
        board.insertCircle("D1");
        board.insertCircle("E1");
        board.insertCircle("F1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle13ColumnWins() {
        //when
        board.insertCircle("C1");
        board.insertCircle("D1");
        board.insertCircle("E1");
        board.insertCircle("F1");
        board.insertCircle("G1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle14ColumnWins() {
        //when
        board.insertCircle("D1");
        board.insertCircle("E1");
        board.insertCircle("F1");
        board.insertCircle("G1");
        board.insertCircle("H1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle15ColumnWins() {
        //when
        board.insertCircle("E1");
        board.insertCircle("F1");
        board.insertCircle("G1");
        board.insertCircle("H1");
        board.insertCircle("I1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle16ColumnWins() {
        //when
        board.insertCircle("F1");
        board.insertCircle("G1");
        board.insertCircle("H1");
        board.insertCircle("I1");
        board.insertCircle("J1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle21ColumnWins() {
        //when
        board.insertCircle("A2");
        board.insertCircle("B2");
        board.insertCircle("C2");
        board.insertCircle("D2");
        board.insertCircle("E2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle22ColumnWins() {
        //when
        board.insertCircle("B2");
        board.insertCircle("C2");
        board.insertCircle("D2");
        board.insertCircle("E2");
        board.insertCircle("F2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle23ColumnWins() {
        //when
        board.insertCircle("C2");
        board.insertCircle("D2");
        board.insertCircle("E2");
        board.insertCircle("F2");
        board.insertCircle("G2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle24ColumnWins() {
        //when
        board.insertCircle("D2");
        board.insertCircle("E2");
        board.insertCircle("F2");
        board.insertCircle("G2");
        board.insertCircle("H2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle25ColumnWins() {
        //when
        board.insertCircle("E2");
        board.insertCircle("F2");
        board.insertCircle("G2");
        board.insertCircle("H2");
        board.insertCircle("I2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle26ColumnWins() {
        //when
        board.insertCircle("F2");
        board.insertCircle("G2");
        board.insertCircle("H2");
        board.insertCircle("I2");
        board.insertCircle("J2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle31ColumnWins() {
        //when
        board.insertCircle("A3");
        board.insertCircle("B3");
        board.insertCircle("C3");
        board.insertCircle("D3");
        board.insertCircle("E3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle32ColumnWins() {
        //when
        board.insertCircle("B3");
        board.insertCircle("C3");
        board.insertCircle("D3");
        board.insertCircle("E3");
        board.insertCircle("F3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle33ColumnWins() {
        //when
        board.insertCircle("C3");
        board.insertCircle("D3");
        board.insertCircle("E3");
        board.insertCircle("F3");
        board.insertCircle("G3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle34ColumnWins() {
        //when
        board.insertCircle("D3");
        board.insertCircle("E3");
        board.insertCircle("F3");
        board.insertCircle("G3");
        board.insertCircle("H3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle35ColumnWins() {
        //when
        board.insertCircle("E3");
        board.insertCircle("F3");
        board.insertCircle("G3");
        board.insertCircle("H3");
        board.insertCircle("I3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle36ColumnWins() {
        //when
        board.insertCircle("F3");
        board.insertCircle("G3");
        board.insertCircle("H3");
        board.insertCircle("I3");
        board.insertCircle("J3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle41ColumnWins() {
        //when
        board.insertCircle("B4");
        board.insertCircle("C4");
        board.insertCircle("D4");
        board.insertCircle("E4");
        board.insertCircle("F4");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle42ColumnWins() {
        //when
        board.insertCircle("C4");
        board.insertCircle("D4");
        board.insertCircle("E4");
        board.insertCircle("F4");
        board.insertCircle("G4");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle43ColumnWins() {
        //when
        board.insertCircle("D4");
        board.insertCircle("E4");
        board.insertCircle("F4");
        board.insertCircle("G4");
        board.insertCircle("H4");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle44ColumnWins() {
        //when
        board.insertCircle("E4");
        board.insertCircle("F4");
        board.insertCircle("G4");
        board.insertCircle("H4");
        board.insertCircle("I4");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle45ColumnWins() {
        //when
        board.insertCircle("F4");
        board.insertCircle("G4");
        board.insertCircle("H4");
        board.insertCircle("I4");
        board.insertCircle("J4");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle51ColumnWins() {
        //when
        board.insertCircle("A5");
        board.insertCircle("B5");
        board.insertCircle("C5");
        board.insertCircle("D5");
        board.insertCircle("E5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle52ColumnWins() {
        //when
        board.insertCircle("B5");
        board.insertCircle("C5");
        board.insertCircle("D5");
        board.insertCircle("E5");
        board.insertCircle("F5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle53ColumnWins() {
        //when
        board.insertCircle("C5");
        board.insertCircle("D5");
        board.insertCircle("E5");
        board.insertCircle("F5");
        board.insertCircle("G5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle54ColumnWins() {
        //when
        board.insertCircle("D5");
        board.insertCircle("E5");
        board.insertCircle("F5");
        board.insertCircle("G5");
        board.insertCircle("H5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle55ColumnWins() {
        //when
        board.insertCircle("E5");
        board.insertCircle("F5");
        board.insertCircle("G5");
        board.insertCircle("H5");
        board.insertCircle("I5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle56ColumnWins() {
        //when
        board.insertCircle("F5");
        board.insertCircle("G5");
        board.insertCircle("H5");
        board.insertCircle("I5");
        board.insertCircle("J5");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle61ColumnWins() {
        //when
        board.insertCircle("A6");
        board.insertCircle("B6");
        board.insertCircle("C6");
        board.insertCircle("D6");
        board.insertCircle("E6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle62ColumnWins() {
        //when
        board.insertCircle("B6");
        board.insertCircle("C6");
        board.insertCircle("D6");
        board.insertCircle("E6");
        board.insertCircle("F6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle63ColumnWins() {
        //when
        board.insertCircle("C6");
        board.insertCircle("D6");
        board.insertCircle("E6");
        board.insertCircle("F6");
        board.insertCircle("G6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle64ColumnWins() {
        //when
        board.insertCircle("D6");
        board.insertCircle("E6");
        board.insertCircle("F6");
        board.insertCircle("G6");
        board.insertCircle("H6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle65ColumnWins() {
        //when
        board.insertCircle("E6");
        board.insertCircle("F6");
        board.insertCircle("G6");
        board.insertCircle("H6");
        board.insertCircle("I6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle66ColumnWins() {
        //when
        board.insertCircle("F6");
        board.insertCircle("G6");
        board.insertCircle("H6");
        board.insertCircle("I6");
        board.insertCircle("J6");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle71ColumnWins() {
        //when
        board.insertCircle("A7");
        board.insertCircle("B7");
        board.insertCircle("C7");
        board.insertCircle("D7");
        board.insertCircle("E7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle72ColumnWins() {
        //when
        board.insertCircle("B7");
        board.insertCircle("C7");
        board.insertCircle("D7");
        board.insertCircle("E7");
        board.insertCircle("F7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle73ColumnWins() {
        //when
        board.insertCircle("C7");
        board.insertCircle("D7");
        board.insertCircle("E7");
        board.insertCircle("F7");
        board.insertCircle("G7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle74ColumnWins() {
        //when
        board.insertCircle("D7");
        board.insertCircle("E7");
        board.insertCircle("F7");
        board.insertCircle("G7");
        board.insertCircle("H7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle75ColumnWins() {
        //when
        board.insertCircle("E7");
        board.insertCircle("F7");
        board.insertCircle("G7");
        board.insertCircle("H7");
        board.insertCircle("I7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle76ColumnWins() {
        //when
        board.insertCircle("F7");
        board.insertCircle("G7");
        board.insertCircle("H7");
        board.insertCircle("I7");
        board.insertCircle("J7");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle81ColumnWins() {
        //when
        board.insertCircle("A8");
        board.insertCircle("B8");
        board.insertCircle("C8");
        board.insertCircle("D8");
        board.insertCircle("E8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle82ColumnWins() {
        //when
        board.insertCircle("B8");
        board.insertCircle("C8");
        board.insertCircle("D8");
        board.insertCircle("E8");
        board.insertCircle("F8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle83ColumnWins() {
        //when
        board.insertCircle("C8");
        board.insertCircle("D8");
        board.insertCircle("E8");
        board.insertCircle("F8");
        board.insertCircle("G8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle84ColumnWins() {
        //when
        board.insertCircle("D8");
        board.insertCircle("E8");
        board.insertCircle("F8");
        board.insertCircle("G8");
        board.insertCircle("H8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle85ColumnWins() {
        //when
        board.insertCircle("E8");
        board.insertCircle("F8");
        board.insertCircle("G8");
        board.insertCircle("H8");
        board.insertCircle("I8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle86ColumnWins() {
        //when
        board.insertCircle("F8");
        board.insertCircle("G8");
        board.insertCircle("H8");
        board.insertCircle("I8");
        board.insertCircle("J8");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle91ColumnWins() {
        //when
        board.insertCircle("A9");
        board.insertCircle("B9");
        board.insertCircle("C9");
        board.insertCircle("D9");
        board.insertCircle("E9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle92ColumnWins() {
        //when
        board.insertCircle("B9");
        board.insertCircle("C9");
        board.insertCircle("D9");
        board.insertCircle("E9");
        board.insertCircle("F9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle93ColumnWins() {
        //when
        board.insertCircle("C9");
        board.insertCircle("D9");
        board.insertCircle("E9");
        board.insertCircle("F9");
        board.insertCircle("G9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle94ColumnWins() {
        //when
        board.insertCircle("D9");
        board.insertCircle("E9");
        board.insertCircle("F9");
        board.insertCircle("G9");
        board.insertCircle("H9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle95ColumnWins() {
        //when
        board.insertCircle("E9");
        board.insertCircle("F9");
        board.insertCircle("G9");
        board.insertCircle("H9");
        board.insertCircle("I9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle96ColumnWins() {
        //when
        board.insertCircle("F9");
        board.insertCircle("G9");
        board.insertCircle("H9");
        board.insertCircle("I9");
        board.insertCircle("J9");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle101ColumnWins() {
        //when
        board.insertCircle("A10");
        board.insertCircle("B10");
        board.insertCircle("C10");
        board.insertCircle("D10");
        board.insertCircle("E10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle102ColumnWins() {
        //when
        board.insertCircle("B10");
        board.insertCircle("C10");
        board.insertCircle("D10");
        board.insertCircle("E10");
        board.insertCircle("F10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle103ColumnWins() {
        //when
        board.insertCircle("C10");
        board.insertCircle("D10");
        board.insertCircle("E10");
        board.insertCircle("F10");
        board.insertCircle("G10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle104ColumnWins() {
        //when
        board.insertCircle("D10");
        board.insertCircle("E10");
        board.insertCircle("F10");
        board.insertCircle("G10");
        board.insertCircle("H10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle105ColumnWins() {
        //when
        board.insertCircle("E10");
        board.insertCircle("F10");
        board.insertCircle("G10");
        board.insertCircle("H10");
        board.insertCircle("I10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle106ColumnWins() {
        //when
        board.insertCircle("F10");
        board.insertCircle("G10");
        board.insertCircle("H10");
        board.insertCircle("I10");
        board.insertCircle("J10");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins1() {
        board.insertCircle("A1");
        board.insertCircle("B2");
        board.insertCircle("C3");
        board.insertCircle("D4");
        board.insertCircle("E5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins2() {
        board.insertCircle("A2");
        board.insertCircle("B3");
        board.insertCircle("C4");
        board.insertCircle("D5");
        board.insertCircle("E6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins3() {
        board.insertCircle("A3");
        board.insertCircle("B4");
        board.insertCircle("C5");
        board.insertCircle("D6");
        board.insertCircle("E7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins4() {
        board.insertCircle("A4");
        board.insertCircle("B5");
        board.insertCircle("C6");
        board.insertCircle("D7");
        board.insertCircle("E8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins5() {
        board.insertCircle("A5");
        board.insertCircle("B6");
        board.insertCircle("C7");
        board.insertCircle("D8");
        board.insertCircle("E9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins6() {
        board.insertCircle("A6");
        board.insertCircle("B7");
        board.insertCircle("C8");
        board.insertCircle("D9");
        board.insertCircle("E10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins7() {
        board.insertCircle("B1");
        board.insertCircle("C2");
        board.insertCircle("D3");
        board.insertCircle("E4");
        board.insertCircle("F5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins8() {
        board.insertCircle("B2");
        board.insertCircle("C3");
        board.insertCircle("D4");
        board.insertCircle("E5");
        board.insertCircle("F6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins9() {
        board.insertCircle("B3");
        board.insertCircle("C4");
        board.insertCircle("D5");
        board.insertCircle("E6");
        board.insertCircle("F7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins10() {
        board.insertCircle("B4");
        board.insertCircle("C5");
        board.insertCircle("D6");
        board.insertCircle("E7");
        board.insertCircle("F8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins11() {
        board.insertCircle("B5");
        board.insertCircle("C6");
        board.insertCircle("D7");
        board.insertCircle("E8");
        board.insertCircle("F9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins12() {
        board.insertCircle("B6");
        board.insertCircle("C7");
        board.insertCircle("D8");
        board.insertCircle("E9");
        board.insertCircle("F10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins13() {
        board.insertCircle("C1");
        board.insertCircle("D2");
        board.insertCircle("E3");
        board.insertCircle("F4");
        board.insertCircle("G5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins14() {
        board.insertCircle("C2");
        board.insertCircle("D3");
        board.insertCircle("E4");
        board.insertCircle("F5");
        board.insertCircle("G6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins15() {
        board.insertCircle("C3");
        board.insertCircle("D4");
        board.insertCircle("E5");
        board.insertCircle("F6");
        board.insertCircle("G7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins16() {
        board.insertCircle("C4");
        board.insertCircle("D5");
        board.insertCircle("E6");
        board.insertCircle("F7");
        board.insertCircle("G8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins17() {
        board.insertCircle("C5");
        board.insertCircle("D6");
        board.insertCircle("E7");
        board.insertCircle("F8");
        board.insertCircle("G9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins18() {
        board.insertCircle("C6");
        board.insertCircle("D7");
        board.insertCircle("E8");
        board.insertCircle("F9");
        board.insertCircle("G10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins19() {
        board.insertCircle("D1");
        board.insertCircle("E2");
        board.insertCircle("F3");
        board.insertCircle("G4");
        board.insertCircle("H5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins20() {
        board.insertCircle("D2");
        board.insertCircle("E3");
        board.insertCircle("F4");
        board.insertCircle("G5");
        board.insertCircle("H6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins21() {
        board.insertCircle("D3");
        board.insertCircle("E4");
        board.insertCircle("F5");
        board.insertCircle("G6");
        board.insertCircle("H7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins22() {
        board.insertCircle("D4");
        board.insertCircle("E5");
        board.insertCircle("F6");
        board.insertCircle("G7");
        board.insertCircle("H8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins23() {
        board.insertCircle("D5");
        board.insertCircle("E6");
        board.insertCircle("F7");
        board.insertCircle("G8");
        board.insertCircle("H9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins24() {
        board.insertCircle("D6");
        board.insertCircle("E7");
        board.insertCircle("F8");
        board.insertCircle("G9");
        board.insertCircle("H10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins25() {
        board.insertCircle("E1");
        board.insertCircle("F2");
        board.insertCircle("G3");
        board.insertCircle("H4");
        board.insertCircle("I5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins26() {
        board.insertCircle("E2");
        board.insertCircle("F3");
        board.insertCircle("G4");
        board.insertCircle("H5");
        board.insertCircle("I6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins27() {
        board.insertCircle("E3");
        board.insertCircle("F4");
        board.insertCircle("G5");
        board.insertCircle("H6");
        board.insertCircle("I7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins28() {
        board.insertCircle("E4");
        board.insertCircle("F5");
        board.insertCircle("G6");
        board.insertCircle("H7");
        board.insertCircle("I8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins29() {
        board.insertCircle("E5");
        board.insertCircle("F6");
        board.insertCircle("G7");
        board.insertCircle("H8");
        board.insertCircle("I9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins30() {
        board.insertCircle("E6");
        board.insertCircle("F7");
        board.insertCircle("G8");
        board.insertCircle("H9");
        board.insertCircle("I10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins31() {
        board.insertCircle("F1");
        board.insertCircle("G2");
        board.insertCircle("H3");
        board.insertCircle("I4");
        board.insertCircle("J5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins32() {
        board.insertCircle("F2");
        board.insertCircle("G3");
        board.insertCircle("H4");
        board.insertCircle("I5");
        board.insertCircle("J6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins33() {
        board.insertCircle("F3");
        board.insertCircle("G4");
        board.insertCircle("H5");
        board.insertCircle("I6");
        board.insertCircle("J7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins34() {
        board.insertCircle("F4");
        board.insertCircle("G5");
        board.insertCircle("H6");
        board.insertCircle("I7");
        board.insertCircle("J8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins35() {
        board.insertCircle("F5");
        board.insertCircle("G6");
        board.insertCircle("H7");
        board.insertCircle("I8");
        board.insertCircle("J9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins36() {
        board.insertCircle("F6");
        board.insertCircle("G7");
        board.insertCircle("H8");
        board.insertCircle("I9");
        board.insertCircle("J10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins1() {
        board.insertCircle("J1");
        board.insertCircle("I2");
        board.insertCircle("H3");
        board.insertCircle("G4");
        board.insertCircle("F5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins2() {
        board.insertCircle("I1");
        board.insertCircle("H2");
        board.insertCircle("G3");
        board.insertCircle("F4");
        board.insertCircle("E5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins3() {
        board.insertCircle("H1");
        board.insertCircle("G2");
        board.insertCircle("F3");
        board.insertCircle("E4");
        board.insertCircle("D5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins4() {
        board.insertCircle("G1");
        board.insertCircle("F2");
        board.insertCircle("E3");
        board.insertCircle("D4");
        board.insertCircle("C5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins5() {
        board.insertCircle("F1");
        board.insertCircle("E2");
        board.insertCircle("D3");
        board.insertCircle("C4");
        board.insertCircle("B5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins6() {
        board.insertCircle("E1");
        board.insertCircle("D2");
        board.insertCircle("C3");
        board.insertCircle("B4");
        board.insertCircle("A5");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins7() {
        board.insertCircle("J2");
        board.insertCircle("I3");
        board.insertCircle("H4");
        board.insertCircle("G5");
        board.insertCircle("F6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins8() {
        board.insertCircle("I2");
        board.insertCircle("H3");
        board.insertCircle("G4");
        board.insertCircle("F5");
        board.insertCircle("E6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins9() {
        board.insertCircle("H2");
        board.insertCircle("G3");
        board.insertCircle("F4");
        board.insertCircle("E5");
        board.insertCircle("D6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins10() {
        board.insertCircle("G2");
        board.insertCircle("F3");
        board.insertCircle("E4");
        board.insertCircle("D5");
        board.insertCircle("C6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins11() {
        board.insertCircle("F2");
        board.insertCircle("E3");
        board.insertCircle("D4");
        board.insertCircle("C5");
        board.insertCircle("B6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins12() {
        board.insertCircle("E2");
        board.insertCircle("D3");
        board.insertCircle("C4");
        board.insertCircle("B5");
        board.insertCircle("A6");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins13() {
        board.insertCircle("J3");
        board.insertCircle("I4");
        board.insertCircle("H5");
        board.insertCircle("G6");
        board.insertCircle("F7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins14() {
        board.insertCircle("I3");
        board.insertCircle("H4");
        board.insertCircle("G5");
        board.insertCircle("F6");
        board.insertCircle("E7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins15() {
        board.insertCircle("H3");
        board.insertCircle("G4");
        board.insertCircle("F5");
        board.insertCircle("E6");
        board.insertCircle("D7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins16() {
        board.insertCircle("G3");
        board.insertCircle("F4");
        board.insertCircle("E5");
        board.insertCircle("D6");
        board.insertCircle("C7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins17() {
        board.insertCircle("F3");
        board.insertCircle("E4");
        board.insertCircle("D5");
        board.insertCircle("C6");
        board.insertCircle("B7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins18() {
        board.insertCircle("E3");
        board.insertCircle("D4");
        board.insertCircle("C5");
        board.insertCircle("B6");
        board.insertCircle("A7");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins19() {
        board.insertCircle("J4");
        board.insertCircle("I5");
        board.insertCircle("H6");
        board.insertCircle("G7");
        board.insertCircle("F8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins20() {
        board.insertCircle("I4");
        board.insertCircle("H5");
        board.insertCircle("G6");
        board.insertCircle("F7");
        board.insertCircle("E8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins21() {
        board.insertCircle("H4");
        board.insertCircle("G5");
        board.insertCircle("F6");
        board.insertCircle("E7");
        board.insertCircle("D8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins22() {
        board.insertCircle("G4");
        board.insertCircle("F5");
        board.insertCircle("E6");
        board.insertCircle("D7");
        board.insertCircle("C8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins23() {
        board.insertCircle("F4");
        board.insertCircle("E5");
        board.insertCircle("D6");
        board.insertCircle("C7");
        board.insertCircle("B8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins24() {
        board.insertCircle("E4");
        board.insertCircle("D5");
        board.insertCircle("C6");
        board.insertCircle("B7");
        board.insertCircle("A8");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins25() {
        board.insertCircle("J5");
        board.insertCircle("I6");
        board.insertCircle("H7");
        board.insertCircle("G8");
        board.insertCircle("F9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins26() {
        board.insertCircle("I5");
        board.insertCircle("H6");
        board.insertCircle("G7");
        board.insertCircle("F8");
        board.insertCircle("E9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins27() {
        board.insertCircle("H5");
        board.insertCircle("G6");
        board.insertCircle("F7");
        board.insertCircle("E8");
        board.insertCircle("D9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins28() {
        board.insertCircle("G5");
        board.insertCircle("F6");
        board.insertCircle("E7");
        board.insertCircle("D8");
        board.insertCircle("C9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins29() {
        board.insertCircle("F5");
        board.insertCircle("E6");
        board.insertCircle("D7");
        board.insertCircle("C8");
        board.insertCircle("B9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins30() {
        board.insertCircle("E5");
        board.insertCircle("D6");
        board.insertCircle("C7");
        board.insertCircle("B8");
        board.insertCircle("A9");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins31() {
        board.insertCircle("J6");
        board.insertCircle("I7");
        board.insertCircle("H8");
        board.insertCircle("G9");
        board.insertCircle("F10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins32() {
        board.insertCircle("I6");
        board.insertCircle("H7");
        board.insertCircle("G8");
        board.insertCircle("F9");
        board.insertCircle("E10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins33() {
        board.insertCircle("H6");
        board.insertCircle("G7");
        board.insertCircle("F8");
        board.insertCircle("E9");
        board.insertCircle("D10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins34() {
        board.insertCircle("G6");
        board.insertCircle("F7");
        board.insertCircle("E8");
        board.insertCircle("D9");
        board.insertCircle("C10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins35() {
        board.insertCircle("F6");
        board.insertCircle("E7");
        board.insertCircle("D8");
        board.insertCircle("C9");
        board.insertCircle("B10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins36() {
        board.insertCircle("E6");
        board.insertCircle("D7");
        board.insertCircle("C8");
        board.insertCircle("B9");
        board.insertCircle("A10");
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCrossA1RowWins() {
        //when
        board.insertCross("A1");
        board.insertCross("A2");
        board.insertCross("A3");
        board.insertCross("A4");
        board.insertCross("A5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossA2RowWins() {
        //when
        board.insertCross("A2");
        board.insertCross("A3");
        board.insertCross("A4");
        board.insertCross("A5");
        board.insertCross("A6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossA3RowWins() {
        //when
        board.insertCross("A3");
        board.insertCross("A4");
        board.insertCross("A5");
        board.insertCross("A6");
        board.insertCross("A7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossA4RowWins() {
        //when
        board.insertCross("A4");
        board.insertCross("A5");
        board.insertCross("A6");
        board.insertCross("A7");
        board.insertCross("A8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossA5RowWins() {
        //when
        board.insertCross("A5");
        board.insertCross("A6");
        board.insertCross("A7");
        board.insertCross("A8");
        board.insertCross("A9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossA6RowWins() {
        //when
        board.insertCross("A6");
        board.insertCross("A7");
        board.insertCross("A8");
        board.insertCross("A9");
        board.insertCross("A10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB1RowWins() {
        //when
        board.insertCross("B1");
        board.insertCross("B2");
        board.insertCross("B3");
        board.insertCross("B4");
        board.insertCross("B5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB2RowWins() {
        //when
        board.insertCross("B2");
        board.insertCross("B3");
        board.insertCross("B4");
        board.insertCross("B5");
        board.insertCross("B6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB3RowWins() {
        //when
        board.insertCross("B3");
        board.insertCross("B4");
        board.insertCross("B5");
        board.insertCross("B6");
        board.insertCross("B7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB4RowWins() {
        //when
        board.insertCross("B4");
        board.insertCross("B5");
        board.insertCross("B6");
        board.insertCross("B7");
        board.insertCross("B8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB5RowWins() {
        //when
        board.insertCross("B5");
        board.insertCross("B6");
        board.insertCross("B7");
        board.insertCross("B8");
        board.insertCross("B9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossB6RowWins() {
        //when
        board.insertCross("B6");
        board.insertCross("B7");
        board.insertCross("B8");
        board.insertCross("B9");
        board.insertCross("B10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC1RowWins() {
        //when
        board.insertCross("C1");
        board.insertCross("C2");
        board.insertCross("C3");
        board.insertCross("C4");
        board.insertCross("C5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC2RowWins() {
        //when
        board.insertCross("C2");
        board.insertCross("C3");
        board.insertCross("C4");
        board.insertCross("C5");
        board.insertCross("C6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC3RowWins() {
        //when
        board.insertCross("C3");
        board.insertCross("C4");
        board.insertCross("C5");
        board.insertCross("C6");
        board.insertCross("C7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC4RowWins() {
        //when
        board.insertCross("C4");
        board.insertCross("C5");
        board.insertCross("C6");
        board.insertCross("C7");
        board.insertCross("C8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC5RowWins() {
        //when
        board.insertCross("C5");
        board.insertCross("C6");
        board.insertCross("C7");
        board.insertCross("C8");
        board.insertCross("C9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossC6RowWins() {
        //when
        board.insertCross("C6");
        board.insertCross("C7");
        board.insertCross("C8");
        board.insertCross("C9");
        board.insertCross("C10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD1RowWins() {
        //when
        board.insertCross("D1");
        board.insertCross("D2");
        board.insertCross("D3");
        board.insertCross("D4");
        board.insertCross("D5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD2RowWins() {
        //when
        board.insertCross("D2");
        board.insertCross("D3");
        board.insertCross("D4");
        board.insertCross("D5");
        board.insertCross("D6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD3RowWins() {
        //when
        board.insertCross("D3");
        board.insertCross("D4");
        board.insertCross("D5");
        board.insertCross("D6");
        board.insertCross("D7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD4RowWins() {
        //when
        board.insertCross("D4");
        board.insertCross("D5");
        board.insertCross("D6");
        board.insertCross("D7");
        board.insertCross("D8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD5RowWins() {
        //when
        board.insertCross("D5");
        board.insertCross("D6");
        board.insertCross("D7");
        board.insertCross("D8");
        board.insertCross("D9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossD6RowWins() {
        //when
        board.insertCross("D6");
        board.insertCross("D7");
        board.insertCross("D8");
        board.insertCross("D9");
        board.insertCross("D10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE1RowWins() {
        //when
        board.insertCross("E1");
        board.insertCross("E2");
        board.insertCross("E3");
        board.insertCross("E4");
        board.insertCross("E5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE2RowWins() {
        //when
        board.insertCross("E2");
        board.insertCross("E3");
        board.insertCross("E4");
        board.insertCross("E5");
        board.insertCross("E6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE3RowWins() {
        //when
        board.insertCross("E3");
        board.insertCross("E4");
        board.insertCross("E5");
        board.insertCross("E6");
        board.insertCross("E7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE4RowWins() {
        //when
        board.insertCross("E4");
        board.insertCross("E5");
        board.insertCross("E6");
        board.insertCross("E7");
        board.insertCross("E8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE5RowWins() {
        //when
        board.insertCross("E5");
        board.insertCross("E6");
        board.insertCross("E7");
        board.insertCross("E8");
        board.insertCross("E9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossE6RowWins() {
        //when
        board.insertCross("E6");
        board.insertCross("E7");
        board.insertCross("E8");
        board.insertCross("E9");
        board.insertCross("E10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossF2RowWins() {
        //when
        board.insertCross("F2");
        board.insertCross("F3");
        board.insertCross("F4");
        board.insertCross("F5");
        board.insertCross("F6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossF3RowWins() {
        //when
        board.insertCross("F3");
        board.insertCross("F4");
        board.insertCross("F5");
        board.insertCross("F6");
        board.insertCross("F7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossF4RowWins() {
        //when
        board.insertCross("F4");
        board.insertCross("F5");
        board.insertCross("F6");
        board.insertCross("F7");
        board.insertCross("F8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossF5RowWins() {
        //when
        board.insertCross("F5");
        board.insertCross("F6");
        board.insertCross("F7");
        board.insertCross("F8");
        board.insertCross("F9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossF6RowWins() {
        //when
        board.insertCross("F6");
        board.insertCross("F7");
        board.insertCross("F8");
        board.insertCross("F9");
        board.insertCross("F10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG1RowWins() {
        //when
        board.insertCross("G1");
        board.insertCross("G2");
        board.insertCross("G3");
        board.insertCross("G4");
        board.insertCross("G5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG2RowWins() {
        //when
        board.insertCross("G2");
        board.insertCross("G3");
        board.insertCross("G4");
        board.insertCross("G5");
        board.insertCross("G6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG3RowWins() {
        //when
        board.insertCross("G3");
        board.insertCross("G4");
        board.insertCross("G5");
        board.insertCross("G6");
        board.insertCross("G7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG4RowWins() {
        //when
        board.insertCross("G4");
        board.insertCross("G5");
        board.insertCross("G6");
        board.insertCross("G7");
        board.insertCross("G8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG5RowWins() {
        //when
        board.insertCross("G5");
        board.insertCross("G6");
        board.insertCross("G7");
        board.insertCross("G8");
        board.insertCross("G9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossG6RowWins() {
        //when
        board.insertCross("G6");
        board.insertCross("G7");
        board.insertCross("G8");
        board.insertCross("G9");
        board.insertCross("G10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH1RowWins() {
        //when
        board.insertCross("H1");
        board.insertCross("H2");
        board.insertCross("H3");
        board.insertCross("H4");
        board.insertCross("H5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH2RowWins() {
        //when
        board.insertCross("H2");
        board.insertCross("H3");
        board.insertCross("H4");
        board.insertCross("H5");
        board.insertCross("H6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH3RowWins() {
        //when
        board.insertCross("H3");
        board.insertCross("H4");
        board.insertCross("H5");
        board.insertCross("H6");
        board.insertCross("H7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH4RowWins() {
        //when
        board.insertCross("H4");
        board.insertCross("H5");
        board.insertCross("H6");
        board.insertCross("H7");
        board.insertCross("H8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH5RowWins() {
        //when
        board.insertCross("H5");
        board.insertCross("H6");
        board.insertCross("H7");
        board.insertCross("H8");
        board.insertCross("H9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossH6RowWins() {
        //when
        board.insertCross("H6");
        board.insertCross("H7");
        board.insertCross("H8");
        board.insertCross("H9");
        board.insertCross("H10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI1RowWins() {
        //when
        board.insertCross("I1");
        board.insertCross("I2");
        board.insertCross("I3");
        board.insertCross("I4");
        board.insertCross("I5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI2RowWins() {
        //when
        board.insertCross("I2");
        board.insertCross("I3");
        board.insertCross("I4");
        board.insertCross("I5");
        board.insertCross("I6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI3RowWins() {
        //when
        board.insertCross("I3");
        board.insertCross("I4");
        board.insertCross("I5");
        board.insertCross("I6");
        board.insertCross("I7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI4RowWins() {
        //when
        board.insertCross("I4");
        board.insertCross("I5");
        board.insertCross("I6");
        board.insertCross("I7");
        board.insertCross("I8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI5RowWins() {
        //when
        board.insertCross("I5");
        board.insertCross("I6");
        board.insertCross("I7");
        board.insertCross("I8");
        board.insertCross("I9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossI6RowWins() {
        //when
        board.insertCross("I6");
        board.insertCross("I7");
        board.insertCross("I8");
        board.insertCross("I9");
        board.insertCross("I10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ1RowWins() {
        //when
        board.insertCross("J1");
        board.insertCross("J2");
        board.insertCross("J3");
        board.insertCross("J4");
        board.insertCross("J5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ2RowWins() {
        //when
        board.insertCross("J2");
        board.insertCross("J3");
        board.insertCross("J4");
        board.insertCross("J5");
        board.insertCross("J6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ3RowWins() {
        //when
        board.insertCross("J3");
        board.insertCross("J4");
        board.insertCross("J5");
        board.insertCross("J6");
        board.insertCross("J7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ4RowWins() {
        //when
        board.insertCross("J4");
        board.insertCross("J5");
        board.insertCross("J6");
        board.insertCross("J7");
        board.insertCross("J8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ5RowWins() {
        //when
        board.insertCross("J5");
        board.insertCross("J6");
        board.insertCross("J7");
        board.insertCross("J8");
        board.insertCross("J9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossJ6RowWins() {
        //when
        board.insertCross("J6");
        board.insertCross("J7");
        board.insertCross("J8");
        board.insertCross("J9");
        board.insertCross("J10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross11ColumnWins() {
        //when
        board.insertCross("A1");
        board.insertCross("B1");
        board.insertCross("C1");
        board.insertCross("D1");
        board.insertCross("E1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross12ColumnWins() {
        //when
        board.insertCross("B1");
        board.insertCross("C1");
        board.insertCross("D1");
        board.insertCross("E1");
        board.insertCross("F1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross13ColumnWins() {
        //when
        board.insertCross("C1");
        board.insertCross("D1");
        board.insertCross("E1");
        board.insertCross("F1");
        board.insertCross("G1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross14ColumnWins() {
        //when
        board.insertCross("D1");
        board.insertCross("E1");
        board.insertCross("F1");
        board.insertCross("G1");
        board.insertCross("H1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross15ColumnWins() {
        //when
        board.insertCross("E1");
        board.insertCross("F1");
        board.insertCross("G1");
        board.insertCross("H1");
        board.insertCross("I1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross16ColumnWins() {
        //when
        board.insertCross("F1");
        board.insertCross("G1");
        board.insertCross("H1");
        board.insertCross("I1");
        board.insertCross("J1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross21ColumnWins() {
        //when
        board.insertCross("A2");
        board.insertCross("B2");
        board.insertCross("C2");
        board.insertCross("D2");
        board.insertCross("E2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross22ColumnWins() {
        //when
        board.insertCross("B2");
        board.insertCross("C2");
        board.insertCross("D2");
        board.insertCross("E2");
        board.insertCross("F2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross23ColumnWins() {
        //when
        board.insertCross("C2");
        board.insertCross("D2");
        board.insertCross("E2");
        board.insertCross("F2");
        board.insertCross("G2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross24ColumnWins() {
        //when
        board.insertCross("D2");
        board.insertCross("E2");
        board.insertCross("F2");
        board.insertCross("G2");
        board.insertCross("H2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross25ColumnWins() {
        //when
        board.insertCross("E2");
        board.insertCross("F2");
        board.insertCross("G2");
        board.insertCross("H2");
        board.insertCross("I2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross26ColumnWins() {
        //when
        board.insertCross("F2");
        board.insertCross("G2");
        board.insertCross("H2");
        board.insertCross("I2");
        board.insertCross("J2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross31ColumnWins() {
        //when
        board.insertCross("A3");
        board.insertCross("B3");
        board.insertCross("C3");
        board.insertCross("D3");
        board.insertCross("E3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross32ColumnWins() {
        //when
        board.insertCross("B3");
        board.insertCross("C3");
        board.insertCross("D3");
        board.insertCross("E3");
        board.insertCross("F3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross33ColumnWins() {
        //when
        board.insertCross("C3");
        board.insertCross("D3");
        board.insertCross("E3");
        board.insertCross("F3");
        board.insertCross("G3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross34ColumnWins() {
        //when
        board.insertCross("D3");
        board.insertCross("E3");
        board.insertCross("F3");
        board.insertCross("G3");
        board.insertCross("H3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross35ColumnWins() {
        //when
        board.insertCross("E3");
        board.insertCross("F3");
        board.insertCross("G3");
        board.insertCross("H3");
        board.insertCross("I3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross36ColumnWins() {
        //when
        board.insertCross("F3");
        board.insertCross("G3");
        board.insertCross("H3");
        board.insertCross("I3");
        board.insertCross("J3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross41ColumnWins() {
        //when
        board.insertCross("B4");
        board.insertCross("C4");
        board.insertCross("D4");
        board.insertCross("E4");
        board.insertCross("F4");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross42ColumnWins() {
        //when
        board.insertCross("C4");
        board.insertCross("D4");
        board.insertCross("E4");
        board.insertCross("F4");
        board.insertCross("G4");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross43ColumnWins() {
        //when
        board.insertCross("D4");
        board.insertCross("E4");
        board.insertCross("F4");
        board.insertCross("G4");
        board.insertCross("H4");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross44ColumnWins() {
        //when
        board.insertCross("E4");
        board.insertCross("F4");
        board.insertCross("G4");
        board.insertCross("H4");
        board.insertCross("I4");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross45ColumnWins() {
        //when
        board.insertCross("F4");
        board.insertCross("G4");
        board.insertCross("H4");
        board.insertCross("I4");
        board.insertCross("J4");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross51ColumnWins() {
        //when
        board.insertCross("A5");
        board.insertCross("B5");
        board.insertCross("C5");
        board.insertCross("D5");
        board.insertCross("E5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross52ColumnWins() {
        //when
        board.insertCross("B5");
        board.insertCross("C5");
        board.insertCross("D5");
        board.insertCross("E5");
        board.insertCross("F5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross53ColumnWins() {
        //when
        board.insertCross("C5");
        board.insertCross("D5");
        board.insertCross("E5");
        board.insertCross("F5");
        board.insertCross("G5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross54ColumnWins() {
        //when
        board.insertCross("D5");
        board.insertCross("E5");
        board.insertCross("F5");
        board.insertCross("G5");
        board.insertCross("H5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross55ColumnWins() {
        //when
        board.insertCross("E5");
        board.insertCross("F5");
        board.insertCross("G5");
        board.insertCross("H5");
        board.insertCross("I5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross56ColumnWins() {
        //when
        board.insertCross("F5");
        board.insertCross("G5");
        board.insertCross("H5");
        board.insertCross("I5");
        board.insertCross("J5");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross61ColumnWins() {
        //when
        board.insertCross("A6");
        board.insertCross("B6");
        board.insertCross("C6");
        board.insertCross("D6");
        board.insertCross("E6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross62ColumnWins() {
        //when
        board.insertCross("B6");
        board.insertCross("C6");
        board.insertCross("D6");
        board.insertCross("E6");
        board.insertCross("F6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross63ColumnWins() {
        //when
        board.insertCross("C6");
        board.insertCross("D6");
        board.insertCross("E6");
        board.insertCross("F6");
        board.insertCross("G6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross64ColumnWins() {
        //when
        board.insertCross("D6");
        board.insertCross("E6");
        board.insertCross("F6");
        board.insertCross("G6");
        board.insertCross("H6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross65ColumnWins() {
        //when
        board.insertCross("E6");
        board.insertCross("F6");
        board.insertCross("G6");
        board.insertCross("H6");
        board.insertCross("I6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross66ColumnWins() {
        //when
        board.insertCross("F6");
        board.insertCross("G6");
        board.insertCross("H6");
        board.insertCross("I6");
        board.insertCross("J6");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross71ColumnWins() {
        //when
        board.insertCross("A7");
        board.insertCross("B7");
        board.insertCross("C7");
        board.insertCross("D7");
        board.insertCross("E7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross72ColumnWins() {
        //when
        board.insertCross("B7");
        board.insertCross("C7");
        board.insertCross("D7");
        board.insertCross("E7");
        board.insertCross("F7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross73ColumnWins() {
        //when
        board.insertCross("C7");
        board.insertCross("D7");
        board.insertCross("E7");
        board.insertCross("F7");
        board.insertCross("G7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross74ColumnWins() {
        //when
        board.insertCross("D7");
        board.insertCross("E7");
        board.insertCross("F7");
        board.insertCross("G7");
        board.insertCross("H7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross75ColumnWins() {
        //when
        board.insertCross("E7");
        board.insertCross("F7");
        board.insertCross("G7");
        board.insertCross("H7");
        board.insertCross("I7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross76ColumnWins() {
        //when
        board.insertCross("F7");
        board.insertCross("G7");
        board.insertCross("H7");
        board.insertCross("I7");
        board.insertCross("J7");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross81ColumnWins() {
        //when
        board.insertCross("A8");
        board.insertCross("B8");
        board.insertCross("C8");
        board.insertCross("D8");
        board.insertCross("E8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross82ColumnWins() {
        //when
        board.insertCross("B8");
        board.insertCross("C8");
        board.insertCross("D8");
        board.insertCross("E8");
        board.insertCross("F8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross83ColumnWins() {
        //when
        board.insertCross("C8");
        board.insertCross("D8");
        board.insertCross("E8");
        board.insertCross("F8");
        board.insertCross("G8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross84ColumnWins() {
        //when
        board.insertCross("D8");
        board.insertCross("E8");
        board.insertCross("F8");
        board.insertCross("G8");
        board.insertCross("H8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross85ColumnWins() {
        //when
        board.insertCross("E8");
        board.insertCross("F8");
        board.insertCross("G8");
        board.insertCross("H8");
        board.insertCross("I8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross86ColumnWins() {
        //when
        board.insertCross("F8");
        board.insertCross("G8");
        board.insertCross("H8");
        board.insertCross("I8");
        board.insertCross("J8");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross91ColumnWins() {
        //when
        board.insertCross("A9");
        board.insertCross("B9");
        board.insertCross("C9");
        board.insertCross("D9");
        board.insertCross("E9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross92ColumnWins() {
        //when
        board.insertCross("B9");
        board.insertCross("C9");
        board.insertCross("D9");
        board.insertCross("E9");
        board.insertCross("F9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross93ColumnWins() {
        //when
        board.insertCross("C9");
        board.insertCross("D9");
        board.insertCross("E9");
        board.insertCross("F9");
        board.insertCross("G9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross94ColumnWins() {
        //when
        board.insertCross("D9");
        board.insertCross("E9");
        board.insertCross("F9");
        board.insertCross("G9");
        board.insertCross("H9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross95ColumnWins() {
        //when
        board.insertCross("E9");
        board.insertCross("F9");
        board.insertCross("G9");
        board.insertCross("H9");
        board.insertCross("I9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross96ColumnWins() {
        //when
        board.insertCross("F9");
        board.insertCross("G9");
        board.insertCross("H9");
        board.insertCross("I9");
        board.insertCross("J9");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross101ColumnWins() {
        //when
        board.insertCross("A10");
        board.insertCross("B10");
        board.insertCross("C10");
        board.insertCross("D10");
        board.insertCross("E10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross102ColumnWins() {
        //when
        board.insertCross("B10");
        board.insertCross("C10");
        board.insertCross("D10");
        board.insertCross("E10");
        board.insertCross("F10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross103ColumnWins() {
        //when
        board.insertCross("C10");
        board.insertCross("D10");
        board.insertCross("E10");
        board.insertCross("F10");
        board.insertCross("G10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross104ColumnWins() {
        //when
        board.insertCross("D10");
        board.insertCross("E10");
        board.insertCross("F10");
        board.insertCross("G10");
        board.insertCross("H10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross105ColumnWins() {
        //when
        board.insertCross("E10");
        board.insertCross("F10");
        board.insertCross("G10");
        board.insertCross("H10");
        board.insertCross("I10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross106ColumnWins() {
        //when
        board.insertCross("F10");
        board.insertCross("G10");
        board.insertCross("H10");
        board.insertCross("I10");
        board.insertCross("J10");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins1() {
        board.insertCross("A1");
        board.insertCross("B2");
        board.insertCross("C3");
        board.insertCross("D4");
        board.insertCross("E5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins2() {
        board.insertCross("A2");
        board.insertCross("B3");
        board.insertCross("C4");
        board.insertCross("D5");
        board.insertCross("E6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins3() {
        board.insertCross("A3");
        board.insertCross("B4");
        board.insertCross("C5");
        board.insertCross("D6");
        board.insertCross("E7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins4() {
        board.insertCross("A4");
        board.insertCross("B5");
        board.insertCross("C6");
        board.insertCross("D7");
        board.insertCross("E8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins5() {
        board.insertCross("A5");
        board.insertCross("B6");
        board.insertCross("C7");
        board.insertCross("D8");
        board.insertCross("E9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins6() {
        board.insertCross("A6");
        board.insertCross("B7");
        board.insertCross("C8");
        board.insertCross("D9");
        board.insertCross("E10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins7() {
        board.insertCross("B1");
        board.insertCross("C2");
        board.insertCross("D3");
        board.insertCross("E4");
        board.insertCross("F5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins8() {
        board.insertCross("B2");
        board.insertCross("C3");
        board.insertCross("D4");
        board.insertCross("E5");
        board.insertCross("F6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins9() {
        board.insertCross("B3");
        board.insertCross("C4");
        board.insertCross("D5");
        board.insertCross("E6");
        board.insertCross("F7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins10() {
        board.insertCross("B4");
        board.insertCross("C5");
        board.insertCross("D6");
        board.insertCross("E7");
        board.insertCross("F8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins11() {
        board.insertCross("B5");
        board.insertCross("C6");
        board.insertCross("D7");
        board.insertCross("E8");
        board.insertCross("F9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins12() {
        board.insertCross("B6");
        board.insertCross("C7");
        board.insertCross("D8");
        board.insertCross("E9");
        board.insertCross("F10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins13() {
        board.insertCross("C1");
        board.insertCross("D2");
        board.insertCross("E3");
        board.insertCross("F4");
        board.insertCross("G5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins14() {
        board.insertCross("C2");
        board.insertCross("D3");
        board.insertCross("E4");
        board.insertCross("F5");
        board.insertCross("G6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins15() {
        board.insertCross("C3");
        board.insertCross("D4");
        board.insertCross("E5");
        board.insertCross("F6");
        board.insertCross("G7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins16() {
        board.insertCross("C4");
        board.insertCross("D5");
        board.insertCross("E6");
        board.insertCross("F7");
        board.insertCross("G8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins17() {
        board.insertCross("C5");
        board.insertCross("D6");
        board.insertCross("E7");
        board.insertCross("F8");
        board.insertCross("G9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins18() {
        board.insertCross("C6");
        board.insertCross("D7");
        board.insertCross("E8");
        board.insertCross("F9");
        board.insertCross("G10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins19() {
        board.insertCross("D1");
        board.insertCross("E2");
        board.insertCross("F3");
        board.insertCross("G4");
        board.insertCross("H5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins20() {
        board.insertCross("D2");
        board.insertCross("E3");
        board.insertCross("F4");
        board.insertCross("G5");
        board.insertCross("H6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins21() {
        board.insertCross("D3");
        board.insertCross("E4");
        board.insertCross("F5");
        board.insertCross("G6");
        board.insertCross("H7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins22() {
        board.insertCross("D4");
        board.insertCross("E5");
        board.insertCross("F6");
        board.insertCross("G7");
        board.insertCross("H8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins23() {
        board.insertCross("D5");
        board.insertCross("E6");
        board.insertCross("F7");
        board.insertCross("G8");
        board.insertCross("H9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins24() {
        board.insertCross("D6");
        board.insertCross("E7");
        board.insertCross("F8");
        board.insertCross("G9");
        board.insertCross("H10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins25() {
        board.insertCross("E1");
        board.insertCross("F2");
        board.insertCross("G3");
        board.insertCross("H4");
        board.insertCross("I5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins26() {
        board.insertCross("E2");
        board.insertCross("F3");
        board.insertCross("G4");
        board.insertCross("H5");
        board.insertCross("I6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins27() {
        board.insertCross("E3");
        board.insertCross("F4");
        board.insertCross("G5");
        board.insertCross("H6");
        board.insertCross("I7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins28() {
        board.insertCross("E4");
        board.insertCross("F5");
        board.insertCross("G6");
        board.insertCross("H7");
        board.insertCross("I8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins29() {
        board.insertCross("E5");
        board.insertCross("F6");
        board.insertCross("G7");
        board.insertCross("H8");
        board.insertCross("I9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins30() {
        board.insertCross("E6");
        board.insertCross("F7");
        board.insertCross("G8");
        board.insertCross("H9");
        board.insertCross("I10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins31() {
        board.insertCross("F1");
        board.insertCross("G2");
        board.insertCross("H3");
        board.insertCross("I4");
        board.insertCross("J5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins32() {
        board.insertCross("F2");
        board.insertCross("G3");
        board.insertCross("H4");
        board.insertCross("I5");
        board.insertCross("J6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins33() {
        board.insertCross("F3");
        board.insertCross("G4");
        board.insertCross("H5");
        board.insertCross("I6");
        board.insertCross("J7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins34() {
        board.insertCross("F4");
        board.insertCross("G5");
        board.insertCross("H6");
        board.insertCross("I7");
        board.insertCross("J8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins35() {
        board.insertCross("F5");
        board.insertCross("G6");
        board.insertCross("H7");
        board.insertCross("I8");
        board.insertCross("J9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins36() {
        board.insertCross("F6");
        board.insertCross("G7");
        board.insertCross("H8");
        board.insertCross("I9");
        board.insertCross("J10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins1() {
        board.insertCross("J1");
        board.insertCross("I2");
        board.insertCross("H3");
        board.insertCross("G4");
        board.insertCross("F5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins2() {
        board.insertCross("I1");
        board.insertCross("H2");
        board.insertCross("G3");
        board.insertCross("F4");
        board.insertCross("E5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins3() {
        board.insertCross("H1");
        board.insertCross("G2");
        board.insertCross("F3");
        board.insertCross("E4");
        board.insertCross("D5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins4() {
        board.insertCross("G1");
        board.insertCross("F2");
        board.insertCross("E3");
        board.insertCross("D4");
        board.insertCross("C5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins5() {
        board.insertCross("F1");
        board.insertCross("E2");
        board.insertCross("D3");
        board.insertCross("C4");
        board.insertCross("B5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins6() {
        board.insertCross("E1");
        board.insertCross("D2");
        board.insertCross("C3");
        board.insertCross("B4");
        board.insertCross("A5");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins7() {
        board.insertCross("J2");
        board.insertCross("I3");
        board.insertCross("H4");
        board.insertCross("G5");
        board.insertCross("F6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins8() {
        board.insertCross("I2");
        board.insertCross("H3");
        board.insertCross("G4");
        board.insertCross("F5");
        board.insertCross("E6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins9() {
        board.insertCross("H2");
        board.insertCross("G3");
        board.insertCross("F4");
        board.insertCross("E5");
        board.insertCross("D6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins10() {
        board.insertCross("G2");
        board.insertCross("F3");
        board.insertCross("E4");
        board.insertCross("D5");
        board.insertCross("C6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins11() {
        board.insertCross("F2");
        board.insertCross("E3");
        board.insertCross("D4");
        board.insertCross("C5");
        board.insertCross("B6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins12() {
        board.insertCross("E2");
        board.insertCross("D3");
        board.insertCross("C4");
        board.insertCross("B5");
        board.insertCross("A6");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins13() {
        board.insertCross("J3");
        board.insertCross("I4");
        board.insertCross("H5");
        board.insertCross("G6");
        board.insertCross("F7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins14() {
        board.insertCross("I3");
        board.insertCross("H4");
        board.insertCross("G5");
        board.insertCross("F6");
        board.insertCross("E7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins15() {
        board.insertCross("H3");
        board.insertCross("G4");
        board.insertCross("F5");
        board.insertCross("E6");
        board.insertCross("D7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins16() {
        board.insertCross("G3");
        board.insertCross("F4");
        board.insertCross("E5");
        board.insertCross("D6");
        board.insertCross("C7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins17() {
        board.insertCross("F3");
        board.insertCross("E4");
        board.insertCross("D5");
        board.insertCross("C6");
        board.insertCross("B7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins18() {
        board.insertCross("E3");
        board.insertCross("D4");
        board.insertCross("C5");
        board.insertCross("B6");
        board.insertCross("A7");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins19() {
        board.insertCross("J4");
        board.insertCross("I5");
        board.insertCross("H6");
        board.insertCross("G7");
        board.insertCross("F8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins20() {
        board.insertCross("I4");
        board.insertCross("H5");
        board.insertCross("G6");
        board.insertCross("F7");
        board.insertCross("E8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins21() {
        board.insertCross("H4");
        board.insertCross("G5");
        board.insertCross("F6");
        board.insertCross("E7");
        board.insertCross("D8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins22() {
        board.insertCross("G4");
        board.insertCross("F5");
        board.insertCross("E6");
        board.insertCross("D7");
        board.insertCross("C8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins23() {
        board.insertCross("F4");
        board.insertCross("E5");
        board.insertCross("D6");
        board.insertCross("C7");
        board.insertCross("B8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins24() {
        board.insertCross("E4");
        board.insertCross("D5");
        board.insertCross("C6");
        board.insertCross("B7");
        board.insertCross("A8");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins25() {
        board.insertCross("J5");
        board.insertCross("I6");
        board.insertCross("H7");
        board.insertCross("G8");
        board.insertCross("F9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins26() {
        board.insertCross("I5");
        board.insertCross("H6");
        board.insertCross("G7");
        board.insertCross("F8");
        board.insertCross("E9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins27() {
        board.insertCross("H5");
        board.insertCross("G6");
        board.insertCross("F7");
        board.insertCross("E8");
        board.insertCross("D9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins28() {
        board.insertCross("G5");
        board.insertCross("F6");
        board.insertCross("E7");
        board.insertCross("D8");
        board.insertCross("C9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins29() {
        board.insertCross("F5");
        board.insertCross("E6");
        board.insertCross("D7");
        board.insertCross("C8");
        board.insertCross("B9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins30() {
        board.insertCross("E5");
        board.insertCross("D6");
        board.insertCross("C7");
        board.insertCross("B8");
        board.insertCross("A9");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins31() {
        board.insertCross("J6");
        board.insertCross("I7");
        board.insertCross("H8");
        board.insertCross("G9");
        board.insertCross("F10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins32() {
        board.insertCross("I6");
        board.insertCross("H7");
        board.insertCross("G8");
        board.insertCross("F9");
        board.insertCross("E10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins33() {
        board.insertCross("H6");
        board.insertCross("G7");
        board.insertCross("F8");
        board.insertCross("E9");
        board.insertCross("D10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins34() {
        board.insertCross("G6");
        board.insertCross("F7");
        board.insertCross("E8");
        board.insertCross("D9");
        board.insertCross("C10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins35() {
        board.insertCross("F6");
        board.insertCross("E7");
        board.insertCross("D8");
        board.insertCross("C9");
        board.insertCross("B10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins36() {
        board.insertCross("E6");
        board.insertCross("D7");
        board.insertCross("C8");
        board.insertCross("B9");
        board.insertCross("A10");
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testTieGame() {
        //when
        board.insertCross("A1");
        board.insertCircle("A2");
        board.insertCross("A3");
        board.insertCircle("A4");
        board.insertCross("A5");
        board.insertCircle("A6");
        board.insertCross("A7");
        board.insertCircle("A8");
        board.insertCross("A9");
        board.insertCircle("A10");
        

        //then
        assertEquals(Board.Winner.TIE, board.checkWinner());
    }

    @Test
    void testNoneWinner() {
        //when
        board.insertCross("A1");
        board.insertCircle("A2");

        //then
        assertEquals(Board.Winner.NONE, board.checkWinner());
    }
}