package CompetitionAPP.AllService;

import java.util.Scanner;

public class StartContest {
    public static void showStartContest() {
        System.out.print("\nThe competition has started!\n" +
                "The system entered a number between 1 and 5." +
                "\nYou enter a number to find the number entered by the system: ");
        int randomNumber = (int) (Math.random() * 5 + 1);
        Scanner scanner = new Scanner(System.in);
        int contestInputNumber = scanner.nextInt();
        if (randomNumber == contestInputNumber) {
            System.out.println("*****Congrats!!! You have won this contest*****\n" +
                    "*****You have found the number entered by the system*****");
        } else {
            System.err.println("Unfortunately, the number entered by the system could not be found.");
        }
    }

    public void loginCloneLogout() {
        showStartContest();
    }
}