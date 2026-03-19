public class RecursivePalindromeUsingSubstring {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // base case 
        { return true;}
            else if (s.charAt(0) != s.charAt(s.length() - 1)) { return false;} // base case
                else { // reduction and recursive call
                    return isPalindrome(s.substring(1, s.length() - 1));
        }   
    }
        public static void main(String[] args) {
            System.out.println("Is moon a Palindrome? " + isPalindrome("moon"));
            System.out.println("Is noon a Palindrome? " + isPalindrome("noon"));
            System.out.println("Is a a Palindrome? " + isPalindrome("a"));
            System.out.println("Is aba a Palindrome? " + isPalindrome("aba"));
            System.out.println("Is aba a Palindrome? " + isPalindrome("ab"));   
    }
    
}

