package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

class PalindromeDemo {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String text = "sum, summus mus!";
        System.out.println(palindrome.replace(text));
        String longText = palindrome.replace(text);
        palindrome.arraySimbl(longText);
        System.out.print(palindrome.isPalindrome(text));



    }
}
