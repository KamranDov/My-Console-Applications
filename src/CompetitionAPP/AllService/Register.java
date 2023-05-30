package CompetitionAPP.AllService;

import java.util.Scanner;

public class Register {
    static int contestant;

    public static void showRegister() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many people will participate in the competition: ");
        contestant = scanner.nextInt();
        System.out.println("He will participate in the competition " + contestant + " person has successfully registered.");
    }

}
