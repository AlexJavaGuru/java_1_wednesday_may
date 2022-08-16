package main.java.lv.javaguru.student_rodions_pismennijs.lesson_7.level_6;

class PalindromeTest {

    public static void main(String[] args) {
        palindromeTest1();
        palindromeTest2();
        palindromeTest3();
        notPalindromeTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static Palindrome palindrome = new Palindrome();

    static void palindromeTest1() {
        check(palindrome.isPalindrome("racecar"), "Is Palindrome 1");
    }

    static void palindromeTest2() {
        check(palindrome.isPalindrome("sum summus mus"), "Is Palindrome 2");
    }

    static void palindromeTest3() {
        check(palindrome.isPalindrome("А Роза Упала на лапу Азора"), "Is Palindrome 3");
    }

    static void notPalindromeTest() {
        check(!palindrome.isPalindrome("hello"), "Not Palindrome");
    }
}
