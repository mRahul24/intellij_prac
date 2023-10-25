package Assignments.Ass6;

public class Lion implements Animal{
    @Override
    public void feed() {
        System.out.println("Lion is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring");
    }
}
