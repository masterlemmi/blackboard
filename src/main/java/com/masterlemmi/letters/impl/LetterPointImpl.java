package com.masterlemmi.letters.impl;

import com.masterlemmi.letters.Letter;
import com.masterlemmi.letters.LetterPoint;
import com.masterlemmi.letters.db.LettersDB;

import java.awt.*;

public class LetterPointImpl implements LetterPoint {
    private LettersDB lettersDB;

    private Letter letter;

    public LetterPointImpl(){
        this.lettersDB  = new LettersDB();
        lettersDB.init();
    }


    @Override
    public LetterPoint usingLetter(String l) {
        this.letter = lettersDB.get(l);

        if (this.letter == null){
            throw new IllegalStateException("Letter jas not been initialized or is missing from letters db");
        }

        return this;
    }

    @Override
    public LetterPoint withSize(int height, int width) {
        if (this.letter == null){
            throw new IllegalStateException("Letter not been initialized or is missing from letters db");
        } else {
            this.letter.setSize(height, width);
        }

        return this;
    }

    @Override
    public LetterPoint startingAtPoint(Point p) {
        this.letter.setStartPoint(p);
        return this;
    }

    @Override
    public Letter build() {
        this.letter.generateInkPoints();
        return this.letter;
    }
}
