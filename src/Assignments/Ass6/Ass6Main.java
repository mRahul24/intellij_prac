package Assignments.Ass6;

public class Ass6Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.feed();
        lion.makeSound();
        Swimmable penguin = new Penguin();
        penguin.swim();
    }
}
