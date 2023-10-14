public class MaximumFinder {

    public static int maximum(int num1, int num2, int num3) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        return largest;
    }

    public static void main(String[] args) {
        int result = maximum(10, 25, 18);
        System.out.println("The largest number is: " + result);
    }
}
