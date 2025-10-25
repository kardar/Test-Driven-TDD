import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.wordz.domain.Letter;
import org.wordz.domain.Score;
import org.wordz.domain.Word;

public class WordsTest {

    @Test
    public void oneIncorrectLetter() {
      var word =  new Word("A");
      var score =  word.guess("Z");

        assertScoreForLetter(score,0, Letter.CORRECT );
    }

    private void assertScoreForLetter(Score score, int i, Letter letter) {
        Assertions.assertEquals(Letter.INCORRECT, score.letter(0));
    }

    @Test
    public void oneCorrectLetter() {
        var word = new Word("A");
        var score = word.guess("A");
        Assertions.assertEquals(Letter.CORRECT, score.letter(0));
    }

}
