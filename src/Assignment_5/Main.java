package Assignment_5;

public class Main {
    public static void main(String[] args) {

        BankClass b = new BankClass();

        b.BankNo = 187164872;
        b.BankId = 392493984;
        b.Balance = 1000;
        b.BankName = "DEENA";
        b.CustomerName = "Dhruv";
        b.AccountNumber = 7823643;

        System.out.println(b.getBalance());
        b.deposit(10);
        System.out.println(b.getBalance());
        b.withdraw(100);
        System.out.println(b.getBalance());
    }
}
