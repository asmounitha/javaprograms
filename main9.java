import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = Integer.parseInt(sc.nextLine().trim());

            try {
                if (n <= 0) {
                    throw new ArithmeticException(
                        "Number of subjects must be positive");
                }

                int total = 0;

                for (int i = 0; i < n; i++) {
                    int mark = Integer.parseInt(
                        sc.nextLine().trim());

                    if (mark < 0 || mark > 100) {
                        throw new IllegalArgumentException(
                            "Marks must be between 0 and 100");
                    }

                    total += mark;
                }

                double average = (double) total / n;
                System.out.printf("Average: %.2f%n", average);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input");
        } finally {
            System.out.println("Calculation completed.");
        }

        sc.close();
    }
}


