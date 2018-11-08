package com.masterlemmi.board;


import org.junit.Test;

public class BlackBoardTest {


    @Test
    public void testEmptyBlackBoard(){
        BlackBoard blackBoard = new BlackBoard();
        assert (blackBoard.array.length == 0);
    }

}