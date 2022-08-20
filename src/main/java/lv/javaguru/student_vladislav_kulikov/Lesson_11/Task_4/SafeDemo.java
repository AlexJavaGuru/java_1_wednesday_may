package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe("111-222", 1000);

        System.out.println(safe.getPinCode());
        System.out.println(safe.getBalance());
        safe.setPinCode("222-333");
        safe.setBalance(10000);
        System.out.println(safe.balance);
        System.out.println(safe.pinCode);
    }
}
