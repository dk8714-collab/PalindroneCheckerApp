import java.util.Scanner;

public class PalindroneCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Reverse using StringBuilder (efficient method)
        String reversed = new StringBuilder(input).reverse().toString();

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
