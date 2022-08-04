package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

class SingableDemo {
    public static void main(String[] args) {
        Singable singer = () -> System.out.println("Baby don't hurt me");
        singer.sing();
        singer.whoAmI();
        Singable ladyGaga = () -> System.out.println("Ale-ale-jandro - Ale-ale-jandro");
        ladyGaga.sing();
    }
}
