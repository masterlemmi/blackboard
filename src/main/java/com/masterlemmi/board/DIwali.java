package com.masterlemmi.board;

import java.util.Arrays;

public class DIwali {

    public static void main(String[] args) {
        String[][] board = new String[13][27];

        //fillBoard
        for (int i = 0; i < 13; i++) {
            Arrays.fill(board[i], "###");
        }


        //letter points
        int[][] letters = {
                {},
                {4, 6, 9, 12, 13, 14, 16, 17, 18, 20, 22},
                {4, 6, 8, 10, 12, 14, 16, 18, 20, 22},
                {4, 5, 6, 8, 9, 10, 12, 13, 14, 16, 17, 18, 21},
                {4, 6, 8, 10, 12, 16, 21},
                {4, 6, 8, 10, 12, 16, 21},
                {},
                {1, 2, 5, 6, 7, 9, 11, 13, 16, 19, 23, 24, 25},
                {1, 3, 6, 9, 11, 13, 15, 17, 19, 24},
                {1, 3, 6, 9, 11, 13, 15, 16, 17, 19, 24},
                {1, 3, 6, 9, 10, 11, 12, 13, 15, 17, 19, 24},
                {1, 2, 5, 6, 7, 10, 12, 15, 17, 19, 20, 21, 23, 24, 25},
        };

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                board[i][letters[i][j]] = "   ";
            }
        }
        //print greeting
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 27; j++) {
                System.out.print(board[i][j]);
            }

            System.out.println();
        }
    }
}