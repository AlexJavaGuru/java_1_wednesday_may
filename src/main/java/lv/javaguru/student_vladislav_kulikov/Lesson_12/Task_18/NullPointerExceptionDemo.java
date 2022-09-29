package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_18;

class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String word = null;
        word.length();// NullPointerException происходит в то время когда программа хочет получить длинну строки word
    }
}
