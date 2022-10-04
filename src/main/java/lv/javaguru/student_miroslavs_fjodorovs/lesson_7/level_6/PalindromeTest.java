package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest();
        palindromeTest.notPalindromeTest();
        palindromeTest.ignoreCapsPalindromeTest();
    }

    static Palindrome palindrome = new Palindrome();

    static void isPalindromeTest() {
        check(palindrome.isPalindrome("level"), "Word Is Palindrome Test");
    }

    static void notPalindromeTest() {
        check(!palindrome.isPalindrome("levels"), "Word Is not Palindrome Test");
    }

    static void ignoreCapsPalindromeTest() {
        check(palindrome.isPalindrome("leVEl"), "Word is Palindrome With Caps Being Ignored");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
