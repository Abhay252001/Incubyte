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

    @Test
    public void numericAlphabates() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("10,50,a,b"), 63);
    }

    @Test
    public void negativeValues() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("-10,50,a,b"), 53);
    }

    @Test
    public void multipleNegativeValues() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("-10,-50,a,b"), 3);
    }

    @Test
    public void biggerThan1000() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("10,50,1000,1001,9999,a,b"), 1063);
    }

    @Test
    public void All() {
        StringCalculator sc = new StringCalculator();
        assertEquals(sc.Add("10,-50,1000,1001,9999,-99,a,b"), 1013);
    }
}