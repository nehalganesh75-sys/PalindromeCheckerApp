import java.util.Stack;

class PalindromeChecker {

    // Public method exposed to outside
    public boolean checkPalindrome(String input) {

        // Pre-processing (ignore spaces & case)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        return isPalindromeUsingStack(normalized);
    }

    // Private helper method (internal logic hidden)
    private boolean isPalindromeUsingStack(String str) {

        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        // Push all characters into stack
        for (char ch : arr) {
            stack.push(ch);
        }

        // Compare stack pop with original order
        for (char ch : arr) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Never odd or even";

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}