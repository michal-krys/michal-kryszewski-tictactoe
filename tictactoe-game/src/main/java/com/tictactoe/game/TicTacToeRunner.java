package com.tictactoe.game;

import java.util.Scanner;

public class TicTacToeRunner {

    public static void main(String[] args) {

        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Tic Tac Toe!\n"
        + "What is your name?");

        String playerName = scanner.nextLine();

        System.out.println("Welcome " + playerName + "!\n" +
                "Bring a friend and play the game :)" +
                "Player 1 is X and Player 2 is O\n" +
                "You'll play on a 3x3 grid\n" +
                "Rows are A, B and C\n" +
                "Columns are 1, 2 and 3\n"+
                "To enter the move you have to write for example \"B2\" " +
                "Enjoy the game!");

        while (!gameOver) {

        }
    }
}
