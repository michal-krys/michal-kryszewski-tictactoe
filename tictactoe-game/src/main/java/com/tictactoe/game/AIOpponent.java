package com.tictactoe.game;

import java.util.List;
import java.util.Random;

public class AIOpponent {

    public enum Difficulty {
        EASY, MEDIUM, HARD
    }

    private final Board.FieldValue aiMove;
    private final Difficulty difficulty;

    public AIOpponent(Board.FieldValue aiMove, Difficulty difficulty) {
        if (difficulty == null) {
            throw new IllegalArgumentException("Difficulty can't be null");
        }
        this.difficulty = difficulty;

        if (aiMove != Board.FieldValue.CIRCLE && aiMove != Board.FieldValue.CROSS) {
            throw new IllegalArgumentException("Opponent can only be CIRCLE or CROSS");
        }
        this.aiMove = aiMove;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    private int minimax(Board board, boolean isMaximizing, int depth) {
        Board.Winner winner = board.checkWinner();

        if (winner == Board.Winner.CIRCLE) {
            return (aiMove == Board.FieldValue.CIRCLE) ? 10 - depth : -10 + depth;
        }

        if (winner == Board.Winner.CROSS) {
            return (aiMove == Board.FieldValue.CIRCLE) ? -10 + depth : 10 - depth;
        }

        if (winner == Board.Winner.TIE || board.getAvailableFields().isEmpty()) {
            return 0;
        }

        int bestValue;
        if (isMaximizing) {
            bestValue = Integer.MIN_VALUE;
            for (String field : board.getAvailableFields()) {
                Board tempBoard = board.clone();
                try {
                    if (aiMove == Board.FieldValue.CIRCLE) {
                        tempBoard.insertCircle(field);
                    } else if (aiMove == Board.FieldValue.CROSS) {
                        tempBoard.insertCross(field);
                    }
                    bestValue = Math.max(bestValue, minimax(tempBoard, false, depth + 1));
                } catch (IllegalArgumentException e) {
                    continue;
                }
            }
        } else {
            bestValue = Integer.MAX_VALUE;
            Board.FieldValue opponentMove = (aiMove == Board.FieldValue.CIRCLE) ? Board.FieldValue.CROSS : Board.FieldValue.CIRCLE;
            for (String field : board.getAvailableFields()) {
                Board tempBoard = board.clone();
                try {
                    if (opponentMove == Board.FieldValue.CIRCLE) {
                        tempBoard.insertCircle(field);
                    } else if (opponentMove == Board.FieldValue.CROSS) {
                        tempBoard.insertCross(field);
                    }
                    bestValue = Math.min(bestValue, minimax(tempBoard, true, depth + 1));
                } catch (IllegalArgumentException e) {
                    continue;
                }
            }
        }
        return bestValue;
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

    public void makeMediumMove(Board board) {
        List<String> availableFields = board.getAvailableFields();

        for (String field : availableFields) {
            Board tempBoard = board.clone();

            try {
                if (aiMove == Board.FieldValue.CIRCLE) {
                    tempBoard.insertCircle(field);
                } else if (aiMove == Board.FieldValue.CROSS) {
                    tempBoard.insertCross(field);
                }

                if (tempBoard.checkWinner() == (aiMove == Board.FieldValue.CIRCLE ? Board.Winner.CIRCLE : Board.Winner.CROSS)) {
                    if (aiMove == Board.FieldValue.CIRCLE) {
                        board.insertCross(field);
                    } else if (aiMove == Board.FieldValue.CROSS) {
                        board.insertCircle(field);
                    }
                    System.out.println("Opponent made move: " + field);
                    return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opponent run into an issue: " + e.getMessage());
            }
        }


        Board.FieldValue opponentMove = (aiMove == Board.FieldValue.CIRCLE) ? Board.FieldValue.CROSS : Board.FieldValue.CIRCLE;
        for (String field : availableFields) {
            Board tempBoard = board.clone();
            try {
                if (opponentMove == Board.FieldValue.CIRCLE) {
                    tempBoard.insertCircle(field);
                } else if (opponentMove == Board.FieldValue.CROSS) {
                    tempBoard.insertCross(field);
                }

                if (tempBoard.checkWinner() == (opponentMove == Board.FieldValue.CIRCLE ? Board.Winner.CIRCLE : Board.Winner.CROSS)) {
                    if (aiMove == Board.FieldValue.CIRCLE) {
                        board.insertCircle(field);
                    } else if (aiMove == Board.FieldValue.CROSS) {
                        board.insertCross(field);
                    }
                    System.out.println("Opponent made move: " + field);
                    return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opponent run into an issue: " + e.getMessage());
            }
        }
        makeRandomMove(board);
    }

    public void makeHardMove(Board board) {
        String bestMove = null;
        int bestValue = Integer.MIN_VALUE;

        List<String> availableFields = board.getAvailableFields();

        for (String field : availableFields) {
            Board tempBoard = board.clone();
            try {
                if (aiMove == Board.FieldValue.CIRCLE) {
                    tempBoard.insertCircle(field);
                } else if (aiMove == Board.FieldValue.CROSS) {
                    tempBoard.insertCross(field);
                }
                int moveValue = minimax(tempBoard, false, 0);
                if (moveValue > bestValue) {
                    bestMove = field;
                    bestValue = moveValue;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opponent run into an issue: " + e.getMessage());
            }
        }

        if (bestMove != null) {
            try {
                if (aiMove == Board.FieldValue.CIRCLE) {
                    board.insertCircle(bestMove);
                } else if (aiMove == Board.FieldValue.CROSS) {
                    board.insertCross(bestMove);
                }
                System.out.println("Opponent made move: " + bestMove);
            } catch (IllegalArgumentException e) {
                System.out.println("Opponent run into an issue: " + e.getMessage());
            }
        } else {
            makeRandomMove(board);
        }
    }
}
