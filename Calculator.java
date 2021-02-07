
public class Calculator{

    History history;
    private double result;

    public Calculator(){
        history = new History();
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
}
