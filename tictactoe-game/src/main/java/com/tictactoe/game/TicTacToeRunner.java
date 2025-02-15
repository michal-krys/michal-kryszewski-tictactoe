package com.tictactoe.game;

import java.util.Scanner;

public class TicTacToeRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        System.out.println("Welcome to Tic Tac Toe!\n"
                + "What is your name?");

        String playerName = scanner.nextLine();

        System.out.println("Welcome " + playerName + "!\n" +
                "Bring a friend and play the game :)\n" +
                "Player 1 is X and Player 2 is O\n" +
                "You'll play on a 3x3 grid\n" +
                "Rows are A, B and C\n" +
                "Columns are 1, 2 and 3\n" +
                "To enter the move you have to write for example \"B2\"\n" +
                "Enjoy the game!");

        do {
            System.out.println("Choose your opponent:\n"
            + "1 -> Player 2 [O]\n"
            + "2 -> Silicon Opponent[O]\n");
            int opponentChoice;

            do {
                try {
                    opponentChoice = Integer.parseInt(scanner.nextLine());
                    if (opponentChoice != 1 && opponentChoice != 2) {
                        System.out.println("Invalid choice. Please choose 1 or 2.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice. Please choose 1 or 2.");
                    opponentChoice = 0;
                }
            } while (opponentChoice != 1 && opponentChoice != 2);

            boolean isPlayingWithAI = opponentChoice == 2;
            AIOpponent aiOpponent = isPlayingWithAI ? new AIOpponent() : null;

            int gridSize;

            do {
                try {
                    System.out.println("How big grid do you want?\n" +
                            "3 -> 3x3 grid\n" +
                            "10 -> 10x10 grid");
                    gridSize = Integer.parseInt(scanner.nextLine());
                    if (gridSize != 3 && gridSize != 10) {
                        System.out.println("Invalid grid size. Please choose 3 or 10.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid grid size. Please choose 3 or 10.");
                    gridSize = 0;
                }
            } while (gridSize != 3 && gridSize != 10);

            Board board = new Board(gridSize);
            boolean gameOver = false;

            System.out.println("New game started");

            while (!gameOver) {

                System.out.println("Player 1 turn:");
                boolean validMove1 = false;
                while (!validMove1) {
                    String player1Input = scanner.nextLine().toUpperCase();
                    try {
                        board.insertCross(player1Input);
                        validMove1 = true;
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage() + "\n Try again.");
                    }
                }

                Board.Winner winner1 = board.checkWinner();
                    if (winner1 != Board.Winner.NONE) {
                        switch (winner1) {
                            case CROSS -> System.out.println("Cross wins!");
                            case CIRCLE -> System.out.println("Circle wins!");
                            case TIE -> System.out.println("It's a tie!");
                        }
                        gameOver = true;
                        continue;
                    }
                    board.printBoard();

                if (isPlayingWithAI) {
                    System.out.println("Silicon Opponent's turn:");
                    aiOpponent.makeRandomMove(board);
                } else {
                    System.out.println("Player 2 turn:");
                    boolean validMove2 = false;
                    while (!validMove2) {
                        String player2Input = scanner.nextLine().toUpperCase();
                        try {
                            board.insertCircle(player2Input);
                            validMove2 = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage() + "\n Try again.\n");
                        }
                    }
                }

                  Board.Winner  winner2 = board.checkWinner();
                    if (winner2 != Board.Winner.NONE) {
                        switch (winner2) {
                            case CROSS -> System.out.println("Cross wins!");
                            case CIRCLE -> System.out.println("Circle wins!");
                            case TIE -> System.out.println("It's a tie!");
                        }
                        gameOver = true;
                    }
                    board.printBoard();
                }

            System.out.println("Press Y to play again.");
            playAgain = scanner.nextLine().equalsIgnoreCase("Y");

        } while (playAgain);

        System.out.println("Thank you for playing!\n" +
                "Good bye :)");
        scanner.close();
    }
}
