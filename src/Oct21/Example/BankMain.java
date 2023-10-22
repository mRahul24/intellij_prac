package Oct21.Example;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("Rahul","Savings",548824,1000);
        System.out.println(bank.withdrawal());
        System.out.println(bank.deposit());
        System.out.println(bank.checkBalance());
        bank.statements();
    }
}
