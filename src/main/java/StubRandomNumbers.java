import org.wordz.domain.RandomNumbers;

public class StubRandomNumbers implements RandomNumbers {
    @Override
    public int nextInt(int upperLimit) {
        return 4;
    }
}
