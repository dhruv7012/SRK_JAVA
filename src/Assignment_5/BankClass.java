package Assignment_5;

public class BankClass {

    public int AccountNumber;
    public String CustomerName;
    public int BankId;
    public String BankName;
    public int BankNo;
    public double Balance;



    public void deposit(double amount){
        Balance = Balance + amount;
    }


    public void withdraw(double amount){

        if (Balance > amount){
            Balance = Balance - amount;
        }
        else {
            System.out.println("Your Bank Balance is less than " + amount);
        }
        
    }

    public double getBalance(){
        return Balance;
    }

    public static void main(String[] args) {

    }
    
}
