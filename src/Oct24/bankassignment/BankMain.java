package Oct24.bankassignment;

import java.util.Scanner;

public class BankMain {
    public static void displayMenu(){
        System.out.println("a. Check Account Balance");
        System.out.println("b. Make a Deposit");
        System.out.println("c. Make a Withdrawal");
        System.out.println("d. Print Account Summary");
        System.out.println("e. exit");


    }
    public static void main(String[] args) throws NegativeNumberException, InsufficientBalanceException {
        Bank option = new Bank();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.next();
            switch (choice) {
                case "a":
                    System.out.println(option.checkAccountBalance());
                    break;
                case "b":
                    System.out.println(option.makeADeposit());
                    break;
                case "c":
                    System.out.println(option.makeAWithdrawal());
                    break;
                case "d":
                    option.printAccountSummary();
                    break;
                case "e":
                    System.out.println("Thank you!\nBye!!!");
                    break;
                default:
                    System.err.println("Enter a valid number");

            }
        }while (!choice.equals("e"));

    }
}