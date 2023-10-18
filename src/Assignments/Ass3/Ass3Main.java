package Assignments.Ass3;

public class Ass3Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator(10.0, 94.0);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
