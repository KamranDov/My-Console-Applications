package CompetitionAPP.AllService;

import java.util.Scanner;

public class Login {

    private final static String USERNAME = "3";
    private final static String PASSWORD = "3";

    public static void showLogin() {

        int whileNumber = 0;
        System.out.print("\nConfirm yourself to participate in the contest!");
        while (whileNumber < 3) {
            Scanner scan = new Scanner(System.in);
            System.out.print("\nEnter your name: ");
            String inputUsername = scan.next();
            System.out.print("Enter password: ");
            String inputPassword = scan.next();


            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("We know you! Good luck in the race.");
                return;
            } else {
                if (whileNumber != 2) {
                    System.err.println("Invalid entry! Please try again.");
                }
            }
            whileNumber++;
        }
        System.err.println("We did not recognize you! Try again after a while.");
        System.exit(0);
    }


    public void loginCloneLogout() {
        showLogin();
    }

}




