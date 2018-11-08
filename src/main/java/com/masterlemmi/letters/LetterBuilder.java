package com.masterlemmi.letters;

import com.masterlemmi.letters.impl.LetterPointImpl;

public  class LetterBuilder {

    public static LetterPoint newLetterBuilder() {
        return new LetterPointImpl();
    }


}
