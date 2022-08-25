package lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class IncreasingNumbersDemo {
    public static void main(String[] args) {
        IncreasingNumbers tester = new IncreasingNumbers();
        System.out.println(tester.increasingNumber(1,2,3));
        System.out.println(tester.increasingNumber(3,2,1));
        System.out.println(tester.increasingNumber(1,2,2));
        System.out.println(tester.increasingNumber(2,2,2));
        System.out.println(tester.increasingNumber(3,2,2));
        System.out.println(tester.increasingNumber(3,2,3));
        System.out.println(tester.increasingNumber(1,3,3));
        System.out.println(tester.increasingNumber(1,3,2));
    }
}
