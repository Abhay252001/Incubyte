import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    @Test
    public void emptyString() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add(""), 0);
    }

    @Test
    public void oneNumber() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("10"), 10);
    }

    @Test
    public void multipleNumbers() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("10,50,90,100"), 250);
    }
}