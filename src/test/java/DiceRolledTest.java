import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.wordz.domain.DiceRoll;

public class DiceRolledTest {

    @Test
    void produceMessage() {
        var stub = new StubRandomNumbers();
        var roll = new DiceRoll(stub);
        var actual = roll.asText();
        Assertions.assertEquals("YOR ROLLED IS 5", actual);

    }
}
