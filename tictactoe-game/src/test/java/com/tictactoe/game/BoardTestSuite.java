package com.tictactoe.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTestSuite {

    @Test
    void testInsertCrossFreeField() {
        //given
        Board board = new Board();
        board.initFields();

        //when&then
        assertDoesNotThrow( () -> board.insertCross("A1"));
        assertDoesNotThrow( () -> board.insertCross("A2"));
        assertDoesNotThrow( () -> board.insertCross("A3"));
        assertDoesNotThrow( () -> board.insertCross("B1"));
        assertDoesNotThrow( () -> board.insertCross("B2"));
        assertDoesNotThrow( () -> board.insertCross("B3"));
        assertDoesNotThrow( () -> board.insertCross("C1"));
        assertDoesNotThrow( () -> board.insertCross("C2"));
        assertDoesNotThrow( () -> board.insertCross("C3"));
    }

    @Test
    void testInsertCrossOccupiedField() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCircle("A2");
        board.insertCross("A3");
        board.insertCircle("B1");
        board.insertCross("B2");
        board.insertCircle("B3");
        board.insertCross("C1");
        board.insertCircle("C2");
        board.insertCross("C3");

        // then
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("A3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("B3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCross("C3"));
    }

    @Test
    void testInsertCircleFreeField() {
        //given
        Board board = new Board();
        board.initFields();

        //when&then
        assertDoesNotThrow( () -> board.insertCircle("A1"));
        assertDoesNotThrow( () -> board.insertCircle("A2"));
        assertDoesNotThrow( () -> board.insertCircle("A3"));
        assertDoesNotThrow( () -> board.insertCircle("B1"));
        assertDoesNotThrow( () -> board.insertCircle("B2"));
        assertDoesNotThrow( () -> board.insertCircle("B3"));
        assertDoesNotThrow( () -> board.insertCircle("C1"));
        assertDoesNotThrow( () -> board.insertCircle("C2"));
        assertDoesNotThrow( () -> board.insertCircle("C3"));
    }

    @Test
    void testInsertCircleOccupiedField() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCircle("A2");
        board.insertCross("A3");
        board.insertCircle("B1");
        board.insertCross("B2");
        board.insertCircle("B3");
        board.insertCross("C1");
        board.insertCircle("C2");
        board.insertCross("C3");

        //then
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("A3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("B3"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C1"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C2"));
        assertThrows(IllegalArgumentException.class, () -> board.insertCircle("C3"));
    }

    @Test
    void testCircleARowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A1");
        board.insertCircle("A2");
        board.insertCircle("A3");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircleBRowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("B1");
        board.insertCircle("B2");
        board.insertCircle("B3");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircleCRowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("C1");
        board.insertCircle("C2");
        board.insertCircle("C3");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircle1ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A1");
        board.insertCircle("B1");
        board.insertCircle("C1");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircle2ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A2");
        board.insertCircle("B2");
        board.insertCircle("C2");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircle3ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A3");
        board.insertCircle("B3");
        board.insertCircle("C3");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A1");
        board.insertCircle("B2");
        board.insertCircle("C3");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCircle("A3");
        board.insertCircle("B2");
        board.insertCircle("C1");

        //then
        assertEquals("Circle wins!", board.checkWinner());
    }

    @Test
    void testCrossARowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCross("A2");
        board.insertCross("A3");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCrossBRowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("B1");
        board.insertCross("B2");
        board.insertCross("B3");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCrossCRowWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("C1");
        board.insertCross("C2");
        board.insertCross("C3");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCross1ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCross("B1");
        board.insertCross("C1");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCross2ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A2");
        board.insertCross("B2");
        board.insertCross("C2");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCross3ColumnWins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A3");
        board.insertCross("B3");
        board.insertCross("C3");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCross("B2");
        board.insertCross("C3");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A3");
        board.insertCross("B2");
        board.insertCross("C1");

        //then
        assertEquals("Cross wins!", board.checkWinner());
    }

    @Test
    void testTieGame() {
        //given
        Board board = new Board();
        board.initFields();

        //when
        board.insertCross("A1");
        board.insertCross("A2");
        board.insertCircle("A3");
        board.insertCircle("B1");
        board.insertCircle("B2");
        board.insertCross("B3");
        board.insertCross("C1");
        board.insertCircle("C2");
        board.insertCircle("C3");

        //then
        assertEquals("It's a tie!", board.checkWinner());
    }
}
