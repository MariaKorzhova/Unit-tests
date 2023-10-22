package HW3;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class NumberInIntervalTest {

    @ParameterizedTest
    @CsvSource({"95, true", "1000, false", "45, true", "188, false"})
    public void numberInIntervalTest(int n, boolean expectedResult) {

        NumberInInterval number = new NumberInInterval();

        boolean result = number.numberInInterval(n);

        assertEquals(expectedResult, result);
    }
}
