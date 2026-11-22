import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte age = 30;

        Date now = new Date();
        System.out.println(now);

        String message = "mouniiiiii";
        System.out.println(message.endsWith(message));

        int[] numbers = new int[5];
        numbers[2] = 10;
        numbers[1] = 50;
        System.out.println(Arrays.toString(numbers));

        NumberFormat currency =
                NumberFormat.getCurrencyInstance(Locale.US);
        String result = currency.format(1234567.8907);
        System.out.println(result);

        NumberFormat percent =
                NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.1);
        System.out.println(percentResult);

        // Use ONE Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int ages = input.nextInt();
        System.out.println("You are " + ages);

        System.out.print("Enter principal: ");
        int principal = input.nextInt();
        System.out.println(principal);

        System.out.print("Enter annual rate: ");
        float annualRate = input.nextFloat();
        System.out.println(annualRate);

        System.out.print("Enter years: ");
        int years = input.nextInt();
        System.out.println(years);

        float rate = annualRate / 12 / 100;
        int numberOfPayments = years * 12;

        double mortgage =
                principal *
                (rate * Math.pow(1 + rate, numberOfPayments)) /
                (Math.pow(1 + rate, numberOfPayments) - 1);

        NumberFormat currencies =
                NumberFormat.getCurrencyInstance(Locale.US);

        String results = currencies.format(mortgage);
        System.out.println("Mortgage: " + results);

        int temp = 30;

        if (temp > 30)
            System.out.println("It's a hot day");
        else if (temp > 20 && temp <= 30)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int incomes = 120_000;

        String className =
                incomes > 100_000 ? "first" : "economy";

        System.out.println(className);
System.out.print("Enter role: ");
String role = input.next();
        
switch (role) {
    case "admin":
        System.out.println("You are the admin");
        break;

    case "moderator":
        System.out.println("You are the moderator");
        break;

    default:
        System.out.println("You are a guest");
        break;
}
System.out.println("enter choice:");
int choice=input.nextInt();
System.out.println("enter number: ");
int number =input.nextInt();
switch(choice){
    case 1:
        if(number%5==0){
            System.out.println("fuzz");
        }
        break;
    case 2:
        if(number%3==0){
            System.out.println("buzz");
        }
        break;
    case 3:
        if(number%5==0 &&number%3==0){
            System.out.println("fizzbuzz");
        }
        break;
    default:
        System.out.println(number);
}
}
}

