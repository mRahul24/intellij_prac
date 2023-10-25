package Oct24.bankexample;

public class ScotiaBank {
    public static void main(String[] args) {

        Bank bank = new Bank();
        double deposit = bank.deposit(1000);
        System.out.println("deposit amout is : "+deposit);

        double withdraw = 0;
        try {
            withdraw = bank.withdraw(1800);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e);
        }
        System.out.println("withdraw " + withdraw);

    }
}
