package Assignments.Ass4;

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: "+ adder.getClass().getSuperclass().toString());
        System.out.println(adder.add(42,13));
    }
}
