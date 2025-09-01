import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("While Loops!");

        Scanner userInput = new Scanner(System.in);
        String userInputString = "";

        // while loop
        /*
        while (!userInputString.equalsIgnoreCase("yes") && !userInputString.equalsIgnoreCase("no")) {
            System.out.println("Are you a meat popsicle?");
            userInputString = userInput.nextLine();
        }
         */

        // do while
        // the do block always runs at least once, a while block may never run.
        do {
            System.out.println("Are you a meat popsicle?");
            userInputString = userInput.nextLine();
        } while (!userInputString.equalsIgnoreCase("yes") && !userInputString.equalsIgnoreCase("no"));

        if (userInputString.equalsIgnoreCase("yes")){
            System.out.println("Thanks for your affirmative response.");
        } else {
            System.out.println("Thanks for your negative response.");
        }

    }
}