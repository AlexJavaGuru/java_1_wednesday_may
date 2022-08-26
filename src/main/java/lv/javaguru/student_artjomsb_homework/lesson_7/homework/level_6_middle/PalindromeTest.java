package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

import java.util.Arrays;

class PalindromeTest {
    public static void main(String[] args) {
        testDeleteSpacing();
        testStringToArray();
        testToLoweCase();
        testMassiveIsPalindrome();
        testMassiveNotPalindrome();
        testFindPalindrome();
        testNotFindPalindrome();
    }

    static void testFindPalindrome() {
        Palindrome tester = new Palindrome();
        tester.setText("А роза      уПала На Лапу Азора   ");
        check(tester.isPalindrome(), "Check that string is palindrome");
    }

    static void testNotFindPalindrome() {
        Palindrome tester = new Palindrome();
        tester.setText("А роза   ,   уПала На Лапу Азора   ");
        check(!tester.isPalindrome(), "Check that string is not palindrome");
    }

    static void testMassiveIsPalindrome() {
        Palindrome tester = new Palindrome();
        String[] array = {"a", "b", "c", "b", "a"};
        check(tester.isMassivePalindrome(array), "Check that array palindrome");
    }

    static void testMassiveNotPalindrome() {
        Palindrome tester = new Palindrome();
        String[] array = {"a", "b", " ", "c", "b", "a"};
        check(!tester.isMassivePalindrome(array), "Check that array not palindrome");
    }

    static void testStringToArray() {
        Palindrome tester = new Palindrome();
        tester.setText("abcdefg");
        String[] result = tester.stringToArray();
        String[] expectedResult = {"a", "b", "c", "d", "e", "f", "g"};
        check(Arrays.equals(result, expectedResult), "Check string put in array");
    }

    static void testDeleteSpacing() {
        Palindrome tester = new Palindrome();
        tester.setText(" a b cd e fg ");
        tester.deleteSpacing();
        String result = tester.getText();
        String expectedResult = "abcdefg";
        check(result.equals(expectedResult), "Check delete spaces from string");
    }

    static void testToLoweCase() {
        Palindrome tester = new Palindrome();
        tester.setText("abC dEFg");
        tester.toLowerCase();
        String result = tester.getText();
        String expectedResult = "abc defg";
        check(result.equals(expectedResult), "Check lower case in string");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
