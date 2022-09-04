package lv.javaguru.student_vladislav_kulikov.lesson_13.task_26_to_32;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public static void main(String[] args) {
        add("1,1,5 adas;\n[[]");
    }
     static int add(String numbers) {
        String[] array = numbers.split("\\D+");
        int result = 0;

        if (checkEmptyFormat(numbers)) {
            System.out.println(0);
        } else {

            List<Integer> integers = convertStringToInt(array);
            for (Integer integer : integers) {
                result += integer;
            }
        }
        return result;
    }

    static private boolean checkEmptyFormat(String string) {
        return string.equals("") || string.equals(" ");
    }

    static private List<Integer> convertStringToInt(String[] array) {
        List<Integer> integers = new ArrayList<>();
        int number = 0;
        for (String s : array) {
            try {
                number = Integer.parseInt(s);
            } catch (NumberFormatException ignored) {

            }
            integers.add(number);
        }
        return integers;
    }
}
