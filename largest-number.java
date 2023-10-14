import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (press enter without entering a value to stop): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > largestNumber) {
                    largestNumber = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        if (largestNumber == Integer.MIN_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largestNumber);
        }
    }
}


// or this should work and more detailed


import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        
        System.out.println("Enter numbers (press Enter to finish):");
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break; // Exit loop if user presses Enter without entering a value
            }
            
            try {
                int number = Integer.parseInt(input);
                if (number > largest) {
                    largest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest number is: " + largest);
        } else {
            System.out.println("No valid numbers were entered.");
        }
        
        scanner.close();
    }
}
