package ATM;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000, input, remainder;
        String bankName = """

                ...:|||||Welcome to DIAMOND bank|||||:...
                ****************************************************************************************
                """;
        String bankInformation = """
                1.Show balance\s
                2.Load money to the balance\s
                3.Withdraw money from the balance
                4.Exit the operation
                ________________________________________________________________________________________
                Enter the operation you will use:""";
        System.out.println(bankName + bankInformation);

        while (true) {

            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Your balance: " + balance + " AZN");
                System.out.println(bankInformation);
            }
            if (input == 2) {
                System.out.println("Enter the amount to be loaded:");
                remainder = scanner.nextInt();
                balance += remainder;
                System.out.println("Your balance: " + balance + " AZN");
                System.out.println(bankInformation);
            }
            if (input == 3) {
                System.out.println("Enter the amount you want to withdraw:");
                remainder = scanner.nextInt();
                if (remainder > balance) {
                    System.err.println("You don't have enough money in your balance");
                    System.out.println(bankInformation);
                } else {
                    balance -= remainder;
                    System.out.println(balance + " AZN remained in the balance");
                    System.out.println(bankInformation);
                }
            }
            if (input == 4) {
                System.out.println("Exited");
                break;
            }
        }
    }
}