import java.util.Stack;

// MAIN CLASS
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


// STRATEGY INTERFACE
interface PalindromeStrategy {
    boolean check(String input);
}


// STACK-BASED STRATEGY IMPLEMENTATION
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char c : input.toCharArray()) {
            stack.push(Character.toLowerCase(c));
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (Character.toLowerCase(c) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}