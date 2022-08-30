package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_30;

class AddNumbers {

    static int sumOfNumbers(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int result = sumOfNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(result);
    }
}
