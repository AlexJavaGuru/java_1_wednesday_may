package lv.javaguru.teacher.lesson_4_if_statement.lessoncode;

public class ConditionalOR {

    public static void main(String[] args) {
        boolean sunny = false;
        boolean rainy = false;

        if (sunny || !rainy) {
            System.out.println("I'm going for a walk");
        }
    }
}
