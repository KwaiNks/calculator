import java.util.List;

public class Calculator {

        private History history;
        private double result;
        private Memory memory;

        public Calculator(History history, Memory memory) {
                this.history = history;
                this.memory = memory;
        }

        public double additionOfTwoNumbers(double firstNumber, double secondNumber) {
                result = firstNumber + secondNumber;
                history.addToCalculatorHistory(firstNumber, '+', secondNumber, '=', result);
                return result;
        }

        public double subtractionOfTwoNumbers(double firstNumber, double secondNumber) {
                result = firstNumber - secondNumber;
                history.addToCalculatorHistory(firstNumber, '-', secondNumber, '=', result);
                return result;
        }

        public double multiplicationOfTwoNumbers(double firstNumber, double secondNumber) {
                result = firstNumber * secondNumber;
                history.addToCalculatorHistory(firstNumber, '*', secondNumber, '=', result);
                return result;
        }

        public double divisionOfTwoNumbers(double firstNumber, double secondNumber) {
                result = firstNumber / secondNumber;
                history.addToCalculatorHistory(firstNumber, '/', secondNumber, '=', result);
                return result;
        }

        public List<HistoryEntry> getCalculatorHistory() {
                return history.getHistory();
        }

        public void storeValueInMemory(double valueToBeStored) {
                memory.setMemory(valueToBeStored);
        }

        public double getValueStoredInMemory() {
                return memory.getMemory();
        }
} 