package org.wordz.domain;

public class Word {

    private final String word;

    public Word(String a) {
        this.word = a;
    }


    public Score guess(String z) {
      var score = new Score(word);
      score.assess( z);
        return score;
    }
}
