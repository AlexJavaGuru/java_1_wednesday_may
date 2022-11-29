package lv.javaguru.student_rodions_pismennijs.lesson_11.level_1;

public class SafeV2Demo {

    public static void main(String[] args) {

        SafeV2 safeV2 = new SafeV2(1234, 20);
        System.out.println(safeV2);
        safeV2.getMoney(4444, 10);
        safeV2.getMoney(1234, 10);
        safeV2.putMoney(5555, 100);
        safeV2.putMoney(1234,100);
        System.out.println(safeV2);
    }
}
