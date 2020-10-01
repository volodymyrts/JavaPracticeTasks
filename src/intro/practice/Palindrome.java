package intro.practice;

// Given a string, return true if the string is a palindrome and false if isn't.
// Include spaces and punctuation in deciding if the string is a palindrome.

public class Palindrome {

    private static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) +
                reverse(input.substring(0, input.length() - 1));
    }

    private static boolean isPalindromeString(final String text){
        String reversed = reverse(text).toLowerCase();
//        if (text.toLowerCase().equals(reversed)) {
//            return true;
//        }
//        return false;
        return text.toLowerCase().equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeString("Java"));
        System.out.println(isPalindromeString("Kabak"));
        System.out.println(isPalindromeString("Cat, a ,tac"));
    }
}
