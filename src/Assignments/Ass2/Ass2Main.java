package Assignments.Ass2;

import java.util.Scanner;

public class Ass2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence you want to reverse: ");
        String sentence = scanner.nextLine();
        int len = sentence.length();
        char[] arraySentence = sentence.toCharArray();
        char[] arraySentenceRev = new char[len];
        for(char e:arraySentence) {
            arraySentenceRev[len-1] = e;
            len--;
        }

        for(char elements:arraySentenceRev) {
            System.out.print(elements);
        }
    }
}
