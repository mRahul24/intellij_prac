package oct28test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
       do {
           System.out.print("Enter a number: ");
           n = scanner.nextInt();
           String[] arr = new String[n + 1];
        if(n>=1 && n<=104) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    arr[i] = "FizzBuzz";
                } else if (i % 5 == 0) {
                    arr[i] = "Buzz";
                } else if (i % 3 == 0) {
                    arr[i] = "Fizz";
                } else {
                    arr[i] = "" + i;
                }
                if (i != n) {
                    System.out.print(arr[i] + ",");
                } else {
                    System.out.print(arr[i]);
                }
            }
        }else{
            System.out.println("Enter number between 1 and 104");
        }
       }while(n<1 || n>104);
    }
}
