package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_11;

class PalindromeTest {

    public static void main(String[] args) {
        isPalindromeTest();
        noPalindromeTest();
        palindromeIgnoreRegister();
    }

    static void isPalindromeTest() {
        Palindrome subject = new Palindrome();
        boolean actualResult = subject.isPalindrome("level");
        check(actualResult, "Is Palindrome Test");
    }

    static void noPalindromeTest() {
        Palindrome subject = new Palindrome();
        boolean actualResult = subject.isPalindrome("hello");
        check(!actualResult, "No Palindrome Test");
    }

    static void palindromeIgnoreRegister() {
        Palindrome subject = new Palindrome();
        boolean actualResult = subject.isPalindrome("LeVEl");
        check(actualResult, "Ignore Palindrome Register");
    }
    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}