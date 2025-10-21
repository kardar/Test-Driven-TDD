package org.wordz.domain;

public class Score {

    private final String correct;
    private Letter result = Letter.INCORRECT ;
    private int position;

    public Score(String correct) {
        this.correct = correct;
    }

    public Letter letter(int position) {
        return result;
    }

    public void assess( String attempt) {
        for (char current : attempt.toCharArray()) {

            if (isCorrectLetter( current)) {
                result = Letter.CORRECT;
            } else if(isOccureInWord(current)) {
                result = Letter.PART_CORRECT;
            }
        }

    }

    private boolean isOccureInWord(char current) {
        return correct.contains(String.valueOf(current));
    }

    private boolean isCorrectLetter( char attempt) {
        return correct.charAt(position) == attempt;
    }

}
