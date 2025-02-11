package com.tictactoe.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScratcherTestSuite {
    @Test
    void testCircleTie() {
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
        board.insertCircle("B1");
        board.insertCross("B2");
        board.insertCircle("B3");
        board.insertCross("B4");
        board.insertCircle("B5");
        board.insertCross("B6");
        board.insertCircle("B7");
        board.insertCross("B8");
        board.insertCircle("B9");
        board.insertCross("B10");
        board.insertCircle("C1");
        board.insertCross("C2");
        board.insertCircle("C3");
        board.insertCross("C4");
        board.insertCircle("C5");
        board.insertCross("C6");
        board.insertCircle("C7");
        board.insertCircle("C8");
        board.insertCircle("C9");
        board.insertCross("C10");
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
        board.insertCircle("F1");
        board.insertCross("F2");
        board.insertCircle("F3");
        board.insertCross("F4");
        board.insertCircle("F5");
        board.insertCross("F6");
        board.insertCircle("F7");
        board.insertCross("F8");
        board.insertCircle("F9");
        board.insertCross("F10");
        board.insertCircle("G1");
        board.insertCross("G2");
        board.insertCircle("G3");
        board.insertCross("G4");
        board.insertCircle("G5");
        board.insertCross("G6");
        board.insertCircle("G7");
        board.insertCross("G8");
        board.insertCircle("G9");
        board.insertCross("G10");
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
        board.insertCircle("J1");
        board.insertCross("J2");
        board.insertCircle("J3");
        board.insertCross("J4");
        board.insertCircle("J5");
        board.insertCross("J6");
        board.insertCircle("J7");
        board.insertCross("J8");
        board.insertCircle("J9");
        board.insertCross("J10");
    }


    Board board = new Board(10);

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
    
    
}
