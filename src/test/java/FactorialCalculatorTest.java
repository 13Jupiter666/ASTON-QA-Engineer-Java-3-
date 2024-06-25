import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialThrowsExceptionForNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}