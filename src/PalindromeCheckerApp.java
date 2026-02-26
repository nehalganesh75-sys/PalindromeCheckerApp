public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display reversed string
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
