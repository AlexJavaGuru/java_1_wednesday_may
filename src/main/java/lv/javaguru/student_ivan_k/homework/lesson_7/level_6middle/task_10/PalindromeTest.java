package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

import java.util.Arrays;

class PalindromeTest {

    public static void main(String[] args) {
        testIsLongText();
        testArraySimbl();
        testIsArrayPalindrome();




    }

    static void testIsLongText() {
        Palindrome palindrome = new Palindrome();
        String testString = "sum, summus mus!";
        String expectedResult = "sumsummusmus";
        String actualResult = palindrome.replace(testString);
        check(actualResult.equals(expectedResult), "Long text");


    }

    static void testArraySimbl(){
        Palindrome palindrome = new Palindrome();
        String longText = "sumsummusmus";
        char[] expectedResult = {'s', 'u', 'm', 's', 'u', 'm', 'm', 'u', 's', 'm', 'u', 's'};
        char[] actualResult = palindrome.arraySimbl(longText);
        check(Arrays.equals(expectedResult,actualResult),"Array simbl");

    }
    static void testIsArrayPalindrome(){
        Palindrome palindrome = new Palindrome();
        char[] testArray = {'s', 'u', 'm', 's', 'u', 'm', 'm', 'u', 's', 'm', 'u', 's'};
        boolean result = palindrome.isArrayPalindrome(testArray);
        check(result,"Array palindrome");
    }


    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println(testName + " text has passed!OK");
        } else {
            System.out.println(testName + " test has failed!!!!");
        }

    }
}