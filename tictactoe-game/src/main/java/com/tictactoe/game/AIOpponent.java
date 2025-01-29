package com.tictactoe.game;

import java.util.List;
import java.util.Random;

public class AIOpponent {

    private Board.FieldValue aiMove;

    public AIOpponent(Board.FieldValue aiMove) {
        if (aiMove != Board.FieldValue.CIRCLE && aiMove != Board.FieldValue.CROSS) {
            throw new IllegalArgumentException("Opponent can only be CIRCLE or CROSS");
        }
        this.aiMove = aiMove;
    }

    public void makeMove(Board board) {
        List<String> availableFields = board.getAvailableFields();

        if (availableFields.isEmpty()) {
            System.out.println("No available fields");
            return;
        }

        Random random = new Random();
        String field = availableFields.get(random.nextInt(availableFields.size()));

        try {
            if (aiMove == Board.FieldValue.CIRCLE) {
                board.insertCircle(field);
            } else if (aiMove == Board.FieldValue.CROSS) {
                board.insertCross(field);
            }
            System.out.println("Opponent made move: " + field);
        } catch (IllegalArgumentException e) {
            System.out.println("Opponent run into an issue: " + e.getMessage());
        }
    }

}
