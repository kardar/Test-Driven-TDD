import org.wordz.domain.domainInterfaces.RandomNumbers;

public class StubRandomNumbers implements RandomNumbers {
    @Override
    public int nextInt(int upperLimit) {
        return 4;
    }
}
