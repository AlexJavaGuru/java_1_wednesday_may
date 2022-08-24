package lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class MobileDemo {
    public static void main(String[] args) {
        Mobile myMobile = new Mobile("Xiaomi",0.200,"Black");
        myMobile.light();
        String brand = myMobile.getBrand();
        double weight = myMobile.getWeight();
        String color = myMobile.getColor();
        System.out.println("My mobile is " + brand);
        System.out.println("My mobile is " + weight + " gram");
        System.out.println("My mobile is " + color + " color");
        myMobile.locked();

    }
}
