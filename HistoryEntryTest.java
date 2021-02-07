import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HistoryEntryTest {

    HistoryEntry historyEntry;

    @Before
    public void setUp() {
        historyEntry = new HistoryEntry(3, '+', 6, '=', 9);
    }

    @Test
    public void shouldReturnTheFirstNumber() {
        assertEquals(3, historyEntry.getFirstNumber(),0);
    }

    @Test
    public void shouldReturnTheOperator() {
        assertEquals('+', historyEntry.getOperator());
    }

    @Test
    public void shouldReturnTheSecondNumber() {
        assertEquals(6, historyEntry.getSecondNumber(),0);
    }

    @Test
    public void shouldReturnTheEquationSign() {
        assertEquals('=', historyEntry.getEquationSign());
    }

    @Test
    public void shouldReturnTheResult() {
        assertEquals(9, historyEntry.getResult(),0);
    }
}
