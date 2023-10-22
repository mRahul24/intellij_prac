package Oct21.Example;

import java.util.Scanner;

public class Bank {

    private String accountHolderName;
    private String accountType;
    private int accountNumber;
    private double accountBalance;
    double totalDespositAmount = 0;
    double totalWithdrawalAmount = 0;
    Scanner scanner = new Scanner(System.in);
    public Bank(String accountHolderName, String accountType, int accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double withdrawal(){
        System.out.print("Enter the amount to Withdrawal: ");
        double withdrawalAmount;
        do {
            withdrawalAmount = scanner.nextDouble();
            if (withdrawalAmount < 0){
                System.err.print("Enter a positive number: ");
            }
            if(withdrawalAmount>accountBalance){
                System.err.print("Entered amount is more than the balance! \nEnter again: ");
            }
        }while (withdrawalAmount < 0 || withdrawalAmount>accountBalance);
        totalWithdrawalAmount += withdrawalAmount;
        accountBalance -= withdrawalAmount;
        System.out.print("Total Balance After Withdraw: ");
        return accountBalance;
    }

    public double deposit(){
        System.out.print("Enter the amount to deposit: ");
        double depositAmount;
        do {
            depositAmount = scanner.nextDouble();
            if (depositAmount < 0){
                System.err.println("Enter a positive number");
            }
        }while (depositAmount < 0);
        totalDespositAmount += depositAmount;
        accountBalance += depositAmount;
        System.out.print("Total Balance After Deposit: ");
        return accountBalance;
    }

    public double checkBalance(){
        System.out.print("Total Balance: ");
        return accountBalance;
    }

    public void statements(){
        System.out.println("Total Amount of Deposits: "+totalDespositAmount);
        System.out.println("Total Amount of Withdrawal: "+totalWithdrawalAmount);

    }
    /*
    account holder name -- setName
    accountType -- you should not be able to change
    accountNumber -- \get it but not change it
    accountBalance -- cannot be modified directly

    methods--
    withdraw() --- balance = 100 - 10, balance 90
    deposit() --- balance = 90 - 200, balance 290
    checkBalance() -- balance 280
    statements() -- print whatever

    --------

    Inheritance -- ScotiaBank etc


     */
}
