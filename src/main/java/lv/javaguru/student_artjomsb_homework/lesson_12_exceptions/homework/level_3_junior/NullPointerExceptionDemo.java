package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_3_junior;

import java.util.List;

class NullPointerExceptionDemo {
    List<String> strings;

    public static void main(String[] args) {
        NullPointerExceptionDemo error = new NullPointerExceptionDemo();
        error.strings.add("Hello");// java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)" because "error.strings" is null
        //(NullPointerExceptionDemo.java:10)
    }
}
