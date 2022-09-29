package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_3;

public class MultiCatchExample {
    public static void main(String[] args) {

        try {
            //ArithmeticException is ancestor of Exception, it need be first
        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
