package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_2intern.task_14;


class ArrayThreAverage {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 11;
        numbers[1] = 9;
        numbers[2] = 2;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averege = sum / numbers.length;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + averege);
    }

}

