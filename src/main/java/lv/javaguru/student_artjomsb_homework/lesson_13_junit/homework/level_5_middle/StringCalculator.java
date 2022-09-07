package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_5_middle;

import java.util.regex.Pattern;

class StringCalculator {
    int add(String numbers) {
        int sum = 0;

        if (numbers.isBlank()) {
            return sum;
        }

        String[] separateNumbers = numbers.split("\\D+");

        for (String separateNumber : separateNumbers) {

            String transformNum = separateNumber.replaceAll("\\s+", "");

            if (!transformNum.isBlank()) {
                sum += Integer.parseInt(transformNum);
            }

        }
        return sum;
    }
}
