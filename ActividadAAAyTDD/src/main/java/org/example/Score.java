package org.example;

public class Score {
    private final String correct;
    private Letter result = Letter.INCORRECT ;
    public Score(String correct) {
        this.correct = correct;
    }
    public Letter letter(int position) {
        return result;
    }

    public void assess(int position, String attempt) {
        if (correct.charAt(position) == attempt.
                charAt(position)) {
            result = Letter.CORRECT;
        }
    }


    public class Score {
        private final String correcto;

        private int position;    public Score(String correct) {
            this.correcto = correcto;    }
        public Letter letter(int position) {
            return result;
        }
        public void assess(String attempt) {
            if (isCorrectLetter(attempt)){
                result = Letter.CORRECT;
            }
        }
        private boolean isCorrectLetter(String attempt) {
            return correct.charAt(position) == attempt.charAt(position);
        }
    }