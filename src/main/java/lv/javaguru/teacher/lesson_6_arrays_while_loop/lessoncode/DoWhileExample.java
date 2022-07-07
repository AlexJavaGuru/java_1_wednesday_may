package main.java.lv.javaguru.teacher.lesson_6_arrays_while_loop.lessoncode;

public class DoWhileExample {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print("i = " + i + "; ");
            i++;
        } while (i < 5);

        String[] alphabet = new String[5];

        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";
//        for (int i = 0; i < alphabet.length; i++) {
//            System.out.println("[" + i + "]: " + alphabet[i]);
//        }
        int j = 0;
        while (j < alphabet.length) {
            System.out.println("[" + j + "]: " + alphabet[j]);
            j++;
        }
    }

}
