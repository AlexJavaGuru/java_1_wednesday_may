package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

class PalindromeTest {

    public static void main(String[] args) {
        palindromeTest();
        palindromeTest1();
        palindromeTest2();
        palindromeTestFail();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

    static Palindrome palindrome = new Palindrome();


    static void palindromeTest() {
        check(palindrome.isPalindrome("racecar"), "Is Palindrome");
    }

    static void palindromeTest1() {
        check(palindrome.isPalindrome("sum summus mus"), "Is Palindrome1" );
    }

    static void palindromeTest2() {
        check(palindrome.isPalindrome("А роза Упала на лапу Азора"), "Is Palindrome 3");
    }

    static void palindromeTestFail() {
        check(!palindrome.isPalindrome("Hi"), "Palindrome Test Fail");
    }
}
