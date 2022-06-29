package main.java.lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode;

public class ExtendedFor {

    public static void main(String[] args) {
        String[] alphabet = new String[5];

        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";
//        for (int i = 0; i < alphabet.length; i++) {
//            System.out.println("[" + i + "]: " + alphabet[i]);
//        }
        for (String letter : alphabet) {
            System.out.println(letter);
        }

    }
}
