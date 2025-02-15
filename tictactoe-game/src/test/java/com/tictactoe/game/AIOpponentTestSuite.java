package com.tictactoe.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AIOpponentTestSuite {

    Board board3 = new Board(3);
    Board board10 = new Board(10);

    @Test
    void testAIOpponentMakesValidMove() {
        //given
        AIOpponent aiOpponent = new AIOpponent();

        //when&then
        assertDoesNotThrow(() -> aiOpponent.makeRandomMove(board3));
        assertDoesNotThrow(() -> aiOpponent.makeRandomMove(board10));
    }
}
