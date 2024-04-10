package org.example;

public class Word {
    private final String Word;
    public Word(String correctWord) {
        this.word = correctWord;
    }
    public String getWord() {
        return Word;
    }
    public void setWord(String word) {

    }
    public  guess(String attempt) {
        var score = new Score(word);
        score.assess( 0, attempt );
        return score;
    }
}

