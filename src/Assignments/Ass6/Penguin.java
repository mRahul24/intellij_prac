package Assignments.Ass6;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is honking");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
