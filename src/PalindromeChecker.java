import java.util.Scanner;

public class PalindromeChecker {
    public static int reverse(int number) {
        String numString = String.valueOf(number); // Convert the integer to a string
        String revString = new StringBuilder(numString).reverse().toString(); // Reverse the string
        return Integer.parseInt(revString); // Convert the reversed string back to an integer
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return number == reversedNumber; // Check if the original number is equal to its reversal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers for palindrome testing: ");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break; // End the loop if 0 is entered
            }

            boolean isPalindrome = isPalindrome(number);
            System.out.print(isPalindrome + " ");
        }

        scanner.close();
    }
}