package com.masterlemmi.board;

import com.masterlemmi.letters.Letter;
import com.masterlemmi.letters.LetterBuilder;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BlackBoard {
    private static final int NEW_LINE_SPACE = 1;
    private static final int LETTER_SPACING = 2;
    String[][] array = new String[0][0];
    private static final int FONT_HEIGHT = 5;
    private static final int FONT_WIDTH = 3;
    private static final String BLANK = "_";
    private static final String INK = "*";
    private Set<Point> inkingPoints = new HashSet<>();
    private int currentRowCount = 0;



    public BlackBoard() {

    }

    public BlackBoard(int length, int width) {
        array = new String[length][width];

    }


    public void write(String words) {
        //increase currentRowCount, each call to write increases currentRowCount
        currentRowCount++;

        //increase board dimension to accomodate new words size
        increaseBoardDimensions(words.length());

        //where the writing happens
        String[] chars = words.split("");
        for (int i = 0; i < chars.length; i++) {
            String s = chars[i];
            Point startPoint = determineStartPoint(i);
            Letter letter = LetterBuilder.newLetterBuilder()
                    .usingLetter(s)
                    .startingAtPoint(startPoint)
                    .withSize(FONT_WIDTH, FONT_HEIGHT)
                    .build();
            inkingPoints.addAll(letter.getPoints());
        }

        plotPoints();
    }

    private void plotPoints() {
        for (Point p: inkingPoints){
            this.array[p.x][p.y] = INK;
        }
    }

    private Point determineStartPoint(int order) {
        int x = (FONT_HEIGHT + 2) * currentRowCount;
        int y = (FONT_WIDTH + 1) * order;//plus one to account for padding// * order determines place

        return new Point(x, y);
    }

    private void copyCurrentBoard(String[][] newArray) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[i][j];
            }
        }
    }

    private void fillBoard(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], BLANK);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sb.append(array[i][j]);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }


    private void increaseBoardDimensions(int charCount) {
        String[][] newArray = createNewBoard(charCount);
        fillBoard(newArray);
        copyCurrentBoard(newArray);
        this.array = newArray;


    }

    private String[][] createNewBoard(int charCount) {
        int rowPadding = NEW_LINE_SPACE * 2;
        int colPadding = LETTER_SPACING * 2;
        int actualRows = (FONT_HEIGHT + rowPadding) * currentRowCount;
        int actualColumns = (FONT_WIDTH + colPadding) * charCount;

        return new String[actualRows][actualColumns];

    }
}
