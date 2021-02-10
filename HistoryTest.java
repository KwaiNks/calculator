import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class HistoryTest {

    private History history;

    @Before
    public void setUp() {
        history = new History();
    }

    @Test
    public void shouldAddAPerformedCalculationToCalculatorHistory() {
        history.addToCalculatorHistory(10, '+', 12, '=', 22);
        assertEquals(1, history.getHistory().size());

        HistoryEntry historyEntriesOne = history.getHistory().get(0);

        assertEquals(10, historyEntriesOne.getFirstNumber(), 0);
        assertEquals('+', historyEntriesOne.getOperator());
        assertEquals(12, historyEntriesOne.getSecondNumber(), 0);
        assertEquals('=', historyEntriesOne.getEquationSign());
        assertEquals(22, historyEntriesOne.getResult(), 0);
    }

    @Test
    public void shouldReturnAHistory() {
        history.addToCalculatorHistory(1, '+', 2, '=', 3);
        assertNotNull(history.getHistory());
    }
}
