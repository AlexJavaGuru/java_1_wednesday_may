package main.java.lv.javaguru.student_ivan_k.lessonwork;

public class TikTak {

    public static void main(String[] args) {

        int[][] field = {{88,18,28},
                         {81,11,21},
                         {82,12,22}};

        for (int i = 0; i < field.length -1; i++) {
            for (int j = 0; j < field.length ; j++) {
                System.out.print(field[j][i]);
                System.out.print("  |   ");
            }
        }
    }
}
