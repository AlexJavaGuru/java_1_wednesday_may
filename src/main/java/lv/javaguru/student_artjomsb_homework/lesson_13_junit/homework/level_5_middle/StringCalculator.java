package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_5_middle;

import java.util.ArrayList;
import java.util.List;

// просто пропускайте это задание, я сам не понимаю что тут понаписал, но тесты проходят, хотя я думаю тут можно сломать :D
class StringCalculator {
    private List<String> delimitersArray = new ArrayList<>();

    int add(String numbers) {
        int sum = 0;

        if (numbers.isBlank()) {
            return sum;
        }

        if (numbers.lastIndexOf("\n") == numbers.length() - 1) {
            System.out.println("Wrong input");
            return sum;
        }

        if (numbers.contains("//")) {
            findDelimiters(numbers);
            for (String s : delimitersArray) {
                numbers = numbers.replaceAll(s + "", ",");
            }
        }

        numbers = numbers.replaceAll("\n", ",").replaceAll(" ", "");

        String[] separateNumbers = numbers.split(",");

        for (String separateNumber : separateNumbers) {

            String transformNum = separateNumber.replaceAll("\\D+", "");

            if (!transformNum.isBlank()) {
                sum += Integer.parseInt(transformNum);
            }

        }
        return sum;
    }

    private void findDelimiters(String s) {
        int startIndex = s.indexOf("//");
        int endIndex = s.indexOf("\n");
        String[] delimiters = s.substring(startIndex, endIndex).split("");
        for (String delimiter : delimiters) {
            if (isDelimiter(delimiter)) {
                delimitersArray.add(delimiter);
            }
        }
    }

    boolean isDelimiter(String s) {
        return !s.equals("[") & !s.equals("]") && !s.equals("/");
    }
}
