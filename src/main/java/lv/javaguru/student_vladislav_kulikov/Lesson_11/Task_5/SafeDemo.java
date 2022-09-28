package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_5;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(1111, 1000);
        safe.getMoney(1111, 500);
        System.out.println(safe.getBalance());
        safe.putMoney(1111, 100);
        System.out.println(safe.getBalance());
    }
}
