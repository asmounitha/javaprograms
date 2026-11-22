 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main10 {

    static double processTransaction(
            double balance, String type, double amount)
            throws IllegalArgumentException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be positive");
        }

        if (type.equals("DEPOSIT")) {
            return balance + amount;
        } else if (type.equals("WITHDRAW")) {
            if (amount > balance) {
                throw new IllegalArgumentException(
                    "Insufficient balance");
            }
            return balance - amount;
        } else {
            throw new IllegalArgumentException(
                "Invalid transaction type");
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {

            double balance = Double.parseDouble(
                br.readLine().trim());
            String type = br.readLine().trim();
            double amount = Double.parseDouble(
                br.readLine().trim());

            try {
                double updatedBalance =
                    processTransaction(balance, type, amount);

                System.out.printf("Balance: %.2f%n",
                                  updatedBalance);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            try {
                throw e; // Rethrow the exception
            } catch (NumberFormatException ex) {
                System.out.println("Error: Invalid numeric input");
            }
        } catch (IOException e) {
            System.out.println("Error: Input failure");
        } finally {
            System.out.println("Transaction processing completed.");
        }
    }
}
