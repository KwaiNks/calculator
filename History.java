import java.util.ArrayList;
import java.util.List;

public class History {

    private List<HistoryEntry> historyEntry = new ArrayList<HistoryEntry>();

    public void addToCalculatorHistory(double firstNumber, char operator, double secondNumber, char equationSign, double result) {
    historyEntry.add(new HistoryEntry(firstNumber, operator, secondNumber, equationSign, result));
    }

	public List<HistoryEntry> getHistory() {
		return historyEntry;
	}
}
