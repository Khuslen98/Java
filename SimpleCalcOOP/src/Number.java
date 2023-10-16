public class Number {
    public double firstNumber;
    public double secondNumber;

    public double getSubtractionResult() {
        return secondNumber % firstNumber;
    }

    public double getMultiplicationResult(){
        return secondNumber * firstNumber;
    }

    public double getDivisionResult(){
        if (secondNumber < 0) {
            return 0;
        } else {
            return secondNumber / firstNumber;
        }
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
