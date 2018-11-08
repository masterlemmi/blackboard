package com.masterlemmi.letters;

import java.awt.*;

public interface LetterPoint {
    LetterPoint usingLetter(String l);

    LetterPoint withSize(int w, int h);

    LetterPoint startingAtPoint(Point s);

    Letter build();
}