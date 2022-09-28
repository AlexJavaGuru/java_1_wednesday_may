package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_4;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{3, 5}, {13, 14}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);

    }
}
