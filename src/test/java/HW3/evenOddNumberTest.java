package HW3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class evenOddNumberTest {
    @ParameterizedTest
    @CsvSource({"4, true", "7, false"})
    public void EvenNumberTest(int n, boolean expectedResult) {

        evenOddNumber number = new evenOddNumber();

        boolean result = number.evenNumber(n);

        assertEquals(expectedResult, result);
    }
}
