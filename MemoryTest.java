import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MemoryTest {

    Memory memory;

    @Before
    public void setUp() {
        memory = new Memory();
    }
    
    @Test
    public void shouldReturnZeroWhenTheMemoryHasNotBeenSet() {
        assertEquals(0, memory.getMemory(), 0);
    }

    @Test
    public void shouldReturnTheValueStoredInMemory() {
        memory.setMemory(1.87);
        assertEquals(1.87, memory.getMemory(), 0);
    } 

    @Test
    public void shouldReturnZeroWhenTheMemoryIsCancelled() {
        memory.setMemory(4.6);
        assertEquals(4.6, memory.getMemory(), 0);
        memory.cancelMemory();
        assertEquals(0.0, memory.getMemory(), 0);
    }

    @Test
    public void shouldReturnZeroWhenMemoryIsSetToNegativeInfinity() {
        memory.setMemory(Double.NEGATIVE_INFINITY);
        assertEquals(0.0, memory.getMemory(), 0);
    }

    @Test
    public void shouldReturnZeroWhenMemoryIsSetToPositveInfinity() {
        memory.setMemory(Double.POSITIVE_INFINITY);
        assertEquals(0.0, memory.getMemory(), 0);
    }   
}
