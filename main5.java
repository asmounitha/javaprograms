import java.util.Scanner;

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class UPI implements Payment {
    private String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Payment of " + amount + " successful");
        System.out.println("UPI ID: " + upiId);
    }

    public void refund(double amount) {
        System.out.println("Refund of " + amount + " successful");
        System.out.println("UPI ID: " + upiId);
    }
}

class NetBanking implements Payment {
    private String bankName;

    NetBanking(String bankName) {
        this.bankName = bankName;
    }

    public void pay(double amount) {
        System.out.println("Net Banking Payment of " + amount + " successful");
        System.out.println("Bank Name: " + bankName);
    }

    public void refund(double amount) {
        System.out.println("Net Banking Refund of " + amount + " successful");
        System.out.println("Bank Name: " + bankName);
    }
}

public class main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter payment amount:");
        double amount = sc.nextDouble();

        System.out.println("1. UPI");
        System.out.println("2. Net Banking");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new UPI("rahul@upi");
                break;

            case 2:
                payment = new NetBanking("State Bank of India");
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\n--- Payment Processing ---");
        payment.pay(amount);

        System.out.println("\n--- Refund Processing ---");
        payment.refund(amount);

        sc.close();
    }
}