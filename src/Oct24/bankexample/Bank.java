package Oct24.bankexample;

public class Bank {
    double balance;

    // deposit

    public double deposit(double deposit) {
        balance = balance + deposit;
        return balance;
    }

    //withdraw
    public double withdraw(double withdraw) throws InsufficientBalanceException {
        // check

        if (withdraw > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!!!");

        }
        else{

        }

        balance = balance - withdraw;
        return balance;
        // balance

    }

}
