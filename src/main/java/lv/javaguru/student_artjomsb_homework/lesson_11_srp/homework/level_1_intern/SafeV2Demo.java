package main.java.lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_1_intern;

class SafeV2Demo {
    public static void main(String[] args) {
        SafeV2 protectedSafe = new SafeV2(0,"cheese");
        System.out.println("Zero - " + protectedSafe.howMuchMoney());
        protectedSafe.putMoney(100,"cheese");
        System.out.println("100 bucks - " + protectedSafe.howMuchMoney());
        protectedSafe.getMoney(50,"chicken");
        System.out.println("Nice try to steal my money " + protectedSafe.howMuchMoney());
    }
}
