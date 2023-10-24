package Oct21.exceptiom;

import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first num: ");
            int x = scanner.nextInt();
            System.out.print("Enter second num: ");
            int y = scanner.nextInt();
        int div=0;
        try {
            div = x / y;
        }

        catch (ArithmeticException e){
            //e.printStackTrace();
            System.err.println("You should set deno as 0");
           System.err.println(e.getMessage());
        }

        System.out.println("Div of nums is: " + div);

    }

}
