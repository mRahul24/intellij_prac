package Assignments.Ass3;

public class Calculator {
    private Double num1;
    private Double num2;

    public Calculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double add() {
        return num1+num2;
    }

    public Double subtract() {
        return num2-num1;
    }

    public Double multiply() {
        return num1*num2;
    }

    public Double divide() {
        return num2/num1;
    }
}
