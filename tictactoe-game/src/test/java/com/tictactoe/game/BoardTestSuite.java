package com.tictactoe.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTestSuite {

    static final int size = 3;
    Board board = new Board(size);

    @Test
    void testInsertCrossFreeField() {
        //given

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

        //when
        board.insertCircle("A1");
        board.insertCircle("A2");
        board.insertCircle("A3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleBRowWins() {
        //given

        //when
        board.insertCircle("B1");
        board.insertCircle("B2");
        board.insertCircle("B3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleCRowWins() {
        //given

        //when
        board.insertCircle("C1");
        board.insertCircle("C2");
        board.insertCircle("C3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle1ColumnWins() {
        //given

        //when
        board.insertCircle("A1");
        board.insertCircle("B1");
        board.insertCircle("C1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle2ColumnWins() {
        //given

        //when
        board.insertCircle("A2");
        board.insertCircle("B2");
        board.insertCircle("C2");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircle3ColumnWins() {
        //given

        //when
        board.insertCircle("A3");
        board.insertCircle("B3");
        board.insertCircle("C3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal1Wins() {
        //given

        //when
        board.insertCircle("A1");
        board.insertCircle("B2");
        board.insertCircle("C3");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCircleDiagonal2Wins() {
        //given

        //when
        board.insertCircle("A3");
        board.insertCircle("B2");
        board.insertCircle("C1");

        //then
        assertEquals(Board.Winner.CIRCLE, board.checkWinner());
    }

    @Test
    void testCrossARowWins() {
        //given

        //when
        board.insertCross("A1");
        board.insertCross("A2");
        board.insertCross("A3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossBRowWins() {
        //given
        //when
        board.insertCross("B1");
        board.insertCross("B2");
        board.insertCross("B3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossCRowWins() {
        //given

        //when
        board.insertCross("C1");
        board.insertCross("C2");
        board.insertCross("C3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross1ColumnWins() {
        //given

        //when
        board.insertCross("A1");
        board.insertCross("B1");
        board.insertCross("C1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross2ColumnWins() {
        //given


        //when
        board.insertCross("A2");
        board.insertCross("B2");
        board.insertCross("C2");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCross3ColumnWins() {
        //given

        //when
        board.insertCross("A3");
        board.insertCross("B3");
        board.insertCross("C3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal1Wins() {
        //given

        //when
        board.insertCross("A1");
        board.insertCross("B2");
        board.insertCross("C3");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testCrossDiagonal2Wins() {
        //given

        //when
        board.insertCross("A3");
        board.insertCross("B2");
        board.insertCross("C1");

        //then
        assertEquals(Board.Winner.CROSS, board.checkWinner());
    }

    @Test
    void testTieGame() {
        //given

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
        assertEquals(Board.Winner.TIE, board.checkWinner());
    }

    @Test
    void testNoneWinner() {
        //given

        //when
        board.insertCross("A1");
        board.insertCircle("A2");

        //then
        assertEquals(Board.Winner.NONE, board.checkWinner());
    }
}
