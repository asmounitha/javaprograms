import java.util.Scanner;
class Bankaccount{
    private String accountNumber;
    private String holdername;
    private double balance;
    Bankaccount(String accountNumber,String holdername,double balance){
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    class Transaction{
        void deposit(double amount){
            if(amount>0){
                balance=balance+amount;
            }
        }
        void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance=balance-amount;
            }
        }
    }
    void displayamount(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holdername);
        System.out.println("Balance: " + balance);
    }
}
public class main4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Bankaccount account=new Bankaccount("ACC101","mouni",10000);
        Bankaccount.Transaction transaction= account.new Transaction();
        double deposit=sc.nextDouble();
        double withdraw=sc.nextDouble();
        transaction.deposit(deposit);
        transaction.withdraw(withdraw);
        account.displayamount();
        sc.close();
    }
}