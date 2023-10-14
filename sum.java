public class Program {
    public static void main(String[] args) {
        // Task a)
        int sumOfOddIntegers = 0;
        for (int i = 1; i <= 99; i += 2) {
            sumOfOddIntegers += i;
        }
        System.out.println("Sum of odd integers between 1 and 99: " + sumOfOddIntegers);

        // Task b)
        double result = Math.pow(2.5, 3);
        System.out.println("2.5 raised to the power of 3: " + result);

        // Task c)
        System.out.println("Integers from 1 to 20 (5 per line):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
