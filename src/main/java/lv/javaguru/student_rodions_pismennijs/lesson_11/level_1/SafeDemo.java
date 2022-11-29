package lv.javaguru.student_rodions_pismennijs.lesson_11.level_1;

public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();

        safe.pinCode = 1234;
        safe.money = 100;

        System.out.println(safe);
    }
}
