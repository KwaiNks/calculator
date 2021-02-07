import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    
    private Calculator calculator;
   // private History history;
    //private CurrencyConverter currencyConverter;
    //private MeasurementCunverter measurementConverter;

@Before
public void setUp() {
    calculator = new Calculator();
}

@Test
public void shouldReturnTheAdditionOfTwoNumbers() {
    assertEquals(10, calculator.additionOfTwoNumbers(4.0,6.0), 0);
}

}