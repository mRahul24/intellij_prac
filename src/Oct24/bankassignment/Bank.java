package Oct24.bankassignment;

import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    double balance = 1000;
    int counterDeposit = 0;
    int counterWithdrawal = 0;
    double totalDespositAmount = 0;
    double totalWithdrawalAmount = 0;
    public double checkAccountBalance(){
        return balance;
    }
    public double makeADeposit() throws NegativeNumberException{
        System.out.print("Enter the amount to deposit: ");
        double depositAmount;
        //do {
            depositAmount = scanner.nextDouble();
            if (depositAmount < 0){
                //System.err.println("Enter a positive number");
                throw new NegativeNumberException("Number should always be positive!!");
            }
        //}while (depositAmount < 0);
        totalDespositAmount += depositAmount;
        balance += depositAmount;
        counterDeposit++;
        return balance;
    }

    public double makeAWithdrawal() throws NegativeNumberException, InsufficientBalanceException{
        System.out.print("Enter the amount to Withdrawal: ");
        double withdrawalAmount;
        //do {
            withdrawalAmount = scanner.nextDouble();
            if (withdrawalAmount < 0){
                //System.err.print("Enter a positive number: ");
                throw new NegativeNumberException("Number should always be positive!!");
            }
            if(withdrawalAmount>balance){
                //System.err.print("Entered amount is more than the balance! \nEnter again: ");
                throw new InsufficientBalanceException("Entered amount is more than the balance!!");
            }
        //}while (withdrawalAmount < 0 || withdrawalAmount>balance);
        totalWithdrawalAmount += withdrawalAmount;
        balance -= withdrawalAmount;
        counterWithdrawal++;
        return balance;
    }

    public void printAccountSummary(){
        System.out.println("Total number of Deposits: "+counterDeposit);
        System.out.println("Total Amount of Deposits: "+totalDespositAmount);
        System.out.println("Total number of Withdrawal: "+counterWithdrawal);
        System.out.println("Total Amount of Withdrawal: "+totalWithdrawalAmount);

    }

}
