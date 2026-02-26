public class PalindromeCheckerApp {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String input) {

        // 1️⃣ Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // 2️⃣ Convert to char array (optional, for clarity)
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome (ignoring spaces & case)");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}