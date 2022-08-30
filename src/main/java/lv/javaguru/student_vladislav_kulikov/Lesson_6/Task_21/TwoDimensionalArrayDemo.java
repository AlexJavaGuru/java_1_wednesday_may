package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_21;


class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray subject = new TwoDimensionalArray();

        int[][] array = subject.makeDimensionalArray(3);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(" ");

        subject.fullWithRandomNumbers(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(" ");

        int sum = subject.sumOfAllNumbers(array);
        System.out.println(sum);
    }
}
