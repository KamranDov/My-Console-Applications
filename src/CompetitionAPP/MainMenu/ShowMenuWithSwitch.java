package CompetitionAPP.MainMenu;

import CompetitionAPP.AllService.Login;
import CompetitionAPP.AllService.Logout;
import CompetitionAPP.AllService.Register;
import CompetitionAPP.AllService.StartContest;

import java.util.Scanner;

public class ShowMenuWithSwitch {
    static Scanner scanner = new Scanner(System.in);

    public static void swtichWithShow() {
        System.out.println("******Welcome to the competition******");
        System.out.print("1.Login\n" +
                "2.Register\n" +
                "\nMake your choice:");
        String choice = "";
        choice = scanner.nextLine();
        switch (choice) {
            case "1" -> Login.showLogin();
            case "2" -> Register.showRegister();
        }
        System.out.print("\n1.Start Contest\n" +
                "2.Logout\n" +
                "3.Exit\n" +
                "\nMake your choice:");

        choice = scanner.nextLine();
        switch (choice) {
            case "1" -> StartContest.showStartContest();
            case "2" -> Logout.showLogout();
            default -> {
                System.err.println("Yarismadan cixis edildi.");
                System.exit(0);
            }
        }
    }
}
