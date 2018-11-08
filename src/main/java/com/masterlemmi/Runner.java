package com.masterlemmi;

import com.masterlemmi.board.BlackBoard;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {

        public static void main(String... args) {
        BlackBoard blackBoard = new BlackBoard();
        blackBoard.write("H");
        System.out.println(blackBoard);
        System.out.println("--------------");
        blackBoard.write("A");
        System.out.println(blackBoard);
    }
}
