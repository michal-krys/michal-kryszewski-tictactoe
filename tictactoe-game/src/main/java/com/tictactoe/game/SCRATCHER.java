package com.tictactoe.game;

import java.util.*;

public class SCRATCHER {

    public static void main(String[] args) {

        Board board = new Board();

        board.initFields();

        System.out.println(board.fields.size());
        System.out.println(board.checkField("A1"));

        board.insertCross("A1");

        System.out.println(board.checkField("A1"));
        System.out.println("fieldName: " + board.fieldName);
        System.out.println("Map keys: " + board.fields.keySet());
        System.out.println("Map values: " + board.fields.values());
        System.out.println("Map entrySet: " + board.fields.entrySet());
        System.out.println(board.checkField("A1"));
    }
}
