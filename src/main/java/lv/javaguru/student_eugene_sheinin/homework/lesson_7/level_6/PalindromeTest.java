package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

public class PalindromeTest {

    public static void main(String[] args) {
        testPalindrome();
        testPalindromeWithSpaces();
        testNotPalindrome();
    }

    private static void testPalindrome() {
        Palindrome subject = new Palindrome();

        check(subject.isPalindrome("Gfdttdfg"), "test Palindrome");
    }

    private static void testPalindromeWithSpaces() {
        Palindrome subject = new Palindrome();

        check(subject.isPalindrome("sum summus mus"), "test Palindrome With Spaces");
    }

    private static void testNotPalindrome() {
        Palindrome subject = new Palindrome();

        check(!subject.isPalindrome("Gfddvs"), "test Not Palindrome");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
