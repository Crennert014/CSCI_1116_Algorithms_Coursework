public class RecursivePalindrome {

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() -1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) {return true;} // Base Case
            else if (s.charAt(low) != s.charAt(high)) {return false;} // Base Case
                else { return isPalindrome(s, low + 1, high - 1);}
    }

    public static void main(String[] args) {
        System.out.println("Is moon a Palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a Palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a Palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a Palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a Palindrome? " + isPalindrome("ab"));
    }
    
}
