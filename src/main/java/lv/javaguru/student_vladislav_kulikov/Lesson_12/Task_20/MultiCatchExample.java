package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_20;


class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e) {
            // Невозможно одновременно ловить ошибку разных типов потому что ArithmeticException,
            // унаследован от RuntimeException
        }
    }
}
