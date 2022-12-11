import com.github.therobinio.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2,3);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Should_substract_two_numbers_and_return_result() {
        int expectedResult = 2 - 3;
        int actualResult = calculator.sub(2,3);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        int expectedResult = 2 * 3;
        int actualResult = calculator.multiply(2,3);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        float expectedResult = (float) 14 / 2;
        float actualResult = calculator.divide(14,2);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }
}
