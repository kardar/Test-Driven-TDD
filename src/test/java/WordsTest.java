import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.wordz.domain.Letter;
import org.wordz.domain.Word;

public class WordsTest {

    @Test
    public void oneIncorrectLetter() {
      var word =  new Word("A");
      var score =  word.guess("Z");
      var result = score.letter(0);

        Assertions.assertEquals(Letter.INCORRECT, result);

    }

    @Test
    public void oneCorrectLetter() {
        var word = new Word("A");
        var score = word.guess("A");
        Assertions.assertEquals(Letter.CORRECT, score.letter(0));
    }

}
