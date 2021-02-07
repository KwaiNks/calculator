import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnTheAdditionOfTwoPositiveNumbers() {
        assertEquals(10, calculator.additionOfTwoNumbers(4.0, 6.0), 0);
    }

    @Test
	public void shouldReturnTheAdditionOfTwoNegativeNumbers(){
		assertEquals(-7, calculator.additionOfTwoNumbers(-4, -3), 0);
	}

    @Test
	public void shouldReturnTheAdditionOfTwoPositiveDecimalNumbers(){
		assertEquals(2, calculator.additionOfTwoNumbers(0.5, 1.5), 0);
	}

    @Test
	public void shouldReturnTheAdditionOfANegativeAndAPositiveDecimalNumber() {
		assertEquals(0, calculator.additionOfTwoNumbers(-0.5, 0.5), 0);
	}

	@Test
	public void shouldReturnTheAdditionOfTwoNegativeDecimalNumbers(){
		assertEquals(-1.0, calculator.additionOfTwoNumbers(-0.5, -0.5), 0);
	}

	@Test
	public void shouldReturnTheAdditionOfANegativeNumberAndANegativeDecimalNumber() {
		assertEquals(-2.33, calculator.additionOfTwoNumbers(-2, -0.33), 0);
	}

	@Test
	public void shouldReturnTheAdditionOfAPositiveNumberAndAPositiveDecimalNumber() {
		assertEquals(7.08, calculator.additionOfTwoNumbers(7.0, 0.08), 0);
	}

    @Test
	public void shouldReturnTheAdditionOfAPositiveAndANegativeNumber() {
		assertEquals(-1, calculator.additionOfTwoNumbers(2, -3), 0);
	}

    @Test
    public void shouldReturnTheSubtractionOfTwoPositiveNumbers() {
        assertEquals(-2.0, calculator.subtractionOfTwoNumbers(4.0, 6.0), 0);
    }

    @Test
	public void shouldReturnTheSubtractionOfTwoNegativeNumbers(){
		assertEquals(-1, calculator.subtractionOfTwoNumbers(-4, -3), 0);
	}

    @Test
	public void shouldReturnTheSubtractionOfTwoPositiveDecimalNumbers(){
		assertEquals(1, calculator.subtractionOfTwoNumbers(1.5, 0.5), 0);
	}

    @Test
	public void shouldReturnTheSubtractionOfANegativeAndAPositiveDecimalNumber() {
		assertEquals(-1.0, calculator.subtractionOfTwoNumbers(-0.5, 0.5), 0);
	}

	@Test
	public void shouldReturnTheSubtractionOfTwoNegativeDecimalNumbers(){
		assertEquals(-3.0, calculator.subtractionOfTwoNumbers(-3.5, -0.5), 0);
	}

	@Test
	public void shouldReturnTheSubtractionOfANegativeNumberAndANegativeDecimalNumber() {
		assertEquals(-1.67, calculator.subtractionOfTwoNumbers(-2, -0.33), 0);
	}

	@Test
	public void shouldReturnTheSubtractionOfAPositiveNumberAndAPositiveDecimalNumber() {
		assertEquals(6.92, calculator.subtractionOfTwoNumbers(7, 0.08), 0);
	}

    @Test
	public void shouldReturnTheSubtractionOfAPositiveAndANegativeNumber() {
		assertEquals(5, calculator.subtractionOfTwoNumbers(2, -3), 0);
	}

    @Test
    public void shouldReturnTheMultiplicationOfTwoPositiveNumbers() {
        assertEquals(24.0, calculator.multiplicationOfTwoNumbers(4.0, 6.0), 0);
    }

    @Test
	public void shouldReturnTheMultiplicationOfTwoNegativeNumbers(){
		assertEquals(12.0, calculator.multiplicationOfTwoNumbers(-4, -3), 0);
	}

    @Test
	public void shouldReturnTheMultiplicationOfTwoPositiveDecimalNumbers(){
		assertEquals(0.75, calculator.multiplicationOfTwoNumbers(1.5, 0.5), 0);
	}

    @Test
	public void shouldReturnTheMultiplicationOfANegativeAndAPositiveDecimalNumber() {
		assertEquals(-0.25, calculator.multiplicationOfTwoNumbers(-0.5, 0.5), 0);
	}

	@Test
	public void shouldReturnTheMultiplicationOfTwoNegativeDecimalNumbers(){
		assertEquals(1.75, calculator.multiplicationOfTwoNumbers(-3.5, -0.5), 0);
	}

	@Test
	public void shouldReturnTheMultiplicationOfANegativeNumberAndANegativeDecimalNumber() {
		assertEquals(0.66, calculator.multiplicationOfTwoNumbers(-2, -0.33), 0);
	}

	@Test
	public void shouldReturnTheMultiplicationOfAPositiveNumberAndAPositiveDecimalNumber() {
		assertEquals(0.56, calculator.multiplicationOfTwoNumbers(7, 0.08), 0);
	}

    @Test
	public void shouldReturnTheMultiplicationOfAPositiveAndANegativeNumber() {
		assertEquals(-6, calculator.multiplicationOfTwoNumbers(2, -3), 0);
	}

    @Test
	public void shouldReturnTheDivisionOfANonZeroPosotiveNumberByZero() {
		assertEquals(Double.POSITIVE_INFINITY, calculator.divisionOfTwoNumbers(2, 0), 0);
	}

    @Test
	public void shouldReturnTheDivisionOfANonZeroNegativeNumberByZero() {
		assertEquals(Double.NEGATIVE_INFINITY, calculator.divisionOfTwoNumbers(-9, 0), 0);
	}

    @Test
	public void shouldReturnTheDivisionOfAZeroByZero() {
		assertEquals(Double.NaN, calculator.divisionOfTwoNumbers(0, 0), 0);
	}

    @Test
    public void shouldReturnTheDivisionOfTwoPositiveNumbers() {
        assertEquals(0.67, calculator.divisionOfTwoNumbers(4.0, 6.0), 0.01);
    }

    @Test
	public void shouldReturnTheDivisionOfTwoNegativeNumbers(){
		assertEquals(1.33, calculator.divisionOfTwoNumbers(-4.0, -3.0), 0.01);
	}

    @Test
	public void shouldReturnTheDivisionOfTwoPositiveDecimalNumbers(){
		assertEquals(3, calculator.divisionOfTwoNumbers(1.5, 0.5), 0);
	}

    @Test
	public void shouldReturnTheDivisionOfANegativeAndAPositiveDecimalNumber() {
		assertEquals(-1, calculator.divisionOfTwoNumbers(-0.5, 0.5), 0);
	}

	@Test
	public void shouldReturnTheDivisionOfTwoNegativeDecimalNumbers(){
		assertEquals(7, calculator.divisionOfTwoNumbers(-3.5, -0.5), 0);
	}

	@Test
	public void shouldReturnTheDivisionOfANegativeNumberAndANegativeDecimalNumber() {
		assertEquals(6.06, calculator.divisionOfTwoNumbers(-2, -0.33), 0.01);
	}

	@Test
	public void shouldReturnTheDivisionOfAPositiveNumberAndAPositiveDecimalNumber() {
		assertEquals(87.5, calculator.divisionOfTwoNumbers(7, 0.08), 0);
	}

    @Test
	public void shouldReturnTheDivisionOfAPositiveAndANegativeNumber() {
		assertEquals(-0.667, calculator.divisionOfTwoNumbers(2, -3), 0.01);
	}
}