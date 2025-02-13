package com.tictactoe.game;

import org.junit.jupiter.api.Test;

public class AIOpponentTestSuite {

    Board board3 = new Board(3);
    Board board10 = new Board(10);

    @Test
    void testEasyAIOpponent() {
        //given
        AIOpponent aiOpponent = new AIOpponent(Board.FieldValue.CIRCLE, AIOpponent.Difficulty.EASY);

        //when
        //then
    }
}
