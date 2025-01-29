package com.tictactoe.game;

import java.util.*;

public class SCRATCHER {

    public static void main(String[] args) {

        final int size = 10;
        Board board = new Board(size);

        board.printBoard();

        board.insertCross("C4");
        board.insertCross("D5");
        board.insertCross("E6");
        board.insertCross("F7");
        board.insertCross("G8");
        board.insertCircle("F2");
        board.checkWinner().toString();
        board.insertCircle("G6");
        board.insertCircle("H3");
        board.insertCircle("I5");
        board.insertCircle("J8");
        board.insertCircle("E9");
        System.out.println("\n" + "\n");
        board.printBoard();
/*
        board.initFields();

        System.out.println(board.fields.size());

        System.out.println(board.fields.get(1));

        System.out.println(board.isValidField("A1"));

        System.out.println(board.fields);

        board.insertCross("A1");

        System.out.println(board.isValidField("A1"));

        System.out.println(board.fields);

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input);

        scanner.close();
 */
    }
}
