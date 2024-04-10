package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        var result = socre.letter(0);
        assertThat(result).isEqualTo(Letter.INCORRECT);



    }
    @Test
    void CorrectLetterOne() {
        var word = new Word("A");
        var score = word.guess("A");
}
