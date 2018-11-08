package com.masterlemmi.letters.db;

import com.masterlemmi.letters.Letter;
import com.masterlemmi.letters.impl.LetterA;
import com.masterlemmi.letters.impl.LetterH;

import java.util.HashMap;
import java.util.Map;

public class LettersDB {

    private Map<String, Letter> db;

    public LettersDB() {
        this.db = new HashMap<>();
    }

    public void init() {
        db.put("A", new LetterA());
        db.put("H", new LetterH());
    }

    public Letter get(String key) {
        return db.get(key);
    }


}
