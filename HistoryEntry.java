
public class HistoryEntry {

    private double firstNumber;
    private char operator;
    private double secondNumber;
    private char equationSign;
    private double result;

    public HistoryEntry(double firstNumber, char operator, double secondNumber, char equationSign, double result) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
        this.equationSign = equationSign;
        this.result = result;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getEquationSign() {
        return equationSign;
    }

    public void setEquationSign(char equationSign) {
        this.equationSign = equationSign;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}