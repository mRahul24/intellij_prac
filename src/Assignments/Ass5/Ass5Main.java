package Assignments.Ass5;

public class Ass5Main {
    public static void main(String[] args) {
        Sports sports = new Sports();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
