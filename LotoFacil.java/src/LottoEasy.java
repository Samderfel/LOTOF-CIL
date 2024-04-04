import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class LottoEasy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int option;

        do {
            System.out.println("**************************");
            System.out.println("LOTTO EASY Menu:");
            System.out.println("1) Bet between 0 and 100");
            System.out.println("2) Bet from A to Z");
            System.out.println("3) Bet on even or odd");
            System.out.println("0) Exit");
            System.out.println("**************************");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a number between 0 and 100: ");
                    int betNumber = scanner.nextInt();
                    if (betNumber < 0 || betNumber > 100) {
                        System.out.println("Invalid bet.");
                    } else {
                        int drawnNumber = random.nextInt(101);
                        if (betNumber == drawnNumber) {
                            System.out.println("You won R$ 1,000.00.");
                        } else {
                            System.out.println("Too bad! The drawn number was: " + drawnNumber + ".");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter a letter from A to Z: ");
                    scanner.nextLine(); // Consume newline
                    char letterInput = scanner.nextLine().toUpperCase().charAt(0);
                    if (!Character.isLetter(letterInput)) {
                        System.out.println("Invalid bet.");
                    } else {
                        char prizeLetter = 'J'; // Replace 'J' with the letter that matches the initial of your name
                        if (letterInput == prizeLetter) {
                            System.out.println("You won R$ 500.00.");
                        } else {
                            System.out.println("Too bad! The awarded letter was: " + prizeLetter + ".");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int evenOddNumber = scanner.nextInt();
                    if (evenOddNumber % 2 == 0) {
                        System.out.println("You won R$ 100.00.");
                    } else {
                        System.out.println("Too bad! The entered number is odd, and the prize went to even numbers.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            // Clear the scanner buffer
            scanner.nextLine();
        } while (option != 0);

        scanner.close();
    }
}