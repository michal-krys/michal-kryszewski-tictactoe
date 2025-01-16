package com.tictactoe.game;

import java.util.*;

public class SCRATCHER {

    public static void main(String[] args) {

        Board board = new Board();

        board.initFields();

        System.out.println(board.fields.size());

        System.out.println(board.fields.get(1));
        /*
        for (String key : board.fields.keySet()) {
            System.out.println(key + ": " + board.checkField(key));
        }

        System.out.println("" +
                "\n " +
        "\n ");
        board.insertCircle("A2");
        board.insertCross("A1");
        board.insertCircle("A3");
        board.insertCross("B1");

        for (String key : board.fields.keySet()) {
            System.out.println(key + ": " + board.checkField(key));
        }
        */
    }
}
