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
    }

    @Test
    void testInsertCircleFreeField() {
        //given
        Board board = new Board();
        board.initFields();

        //when&then
        assertDoesNotThrow( () -> board.insertCircle("A1"));
    }
}
