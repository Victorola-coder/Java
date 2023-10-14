import java.util.Scanner;
import java.util.Random;

enum Coin {
    HEADS,
    TAILS
}

public class CoinTossingSimulation {

    private static int headsCount = 0;
    private static int tailsCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Coin tossResult = flip();
                if (tossResult == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                System.out.println("Coin toss result: " + tossResult);
                System.out.println("Heads count: " + headsCount);
                System.out.println("Tails count: " + tailsCount);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static Coin flip() {
        Random random = new Random();
        int outcome = random.nextInt(2);
        if (outcome == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}
