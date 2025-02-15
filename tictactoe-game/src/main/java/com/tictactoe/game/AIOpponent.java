package com.tictactoe.game;

import java.util.List;
import java.util.Random;

public class AIOpponent {


    public AIOpponent() {
    }

    public void makeRandomMove(Board board) {
        List<String> availableFields = board.getAvailableFields();

        if (availableFields.isEmpty()) {
            System.out.println("No available fields");
            return;
        }

        Random random = new Random();
        String field = availableFields.get(random.nextInt(availableFields.size()));

        try {
            board.insertCircle(field);
            System.out.println("Opponent made move: " + field);
        } catch (IllegalArgumentException e) {
            System.out.println("Opponent run into an issue: " + e.getMessage());
        }
    }
}
