package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_5;

import java.util.*;

public class StringCalculator {

    int add(String numbers) {

        Map<String, String> parsedData = parseStringWithNumbers(numbers);

        return getSumOfParsedStringNumbers(
                parsedData.get("parsedString"),
                parsedData.get("delimiters")
        );
    }

    private Map<String, String> parseStringWithNumbers(String numbers) {
        char[] chars =  numbers.toCharArray();
        StringBuffer delimiters = new StringBuffer();
        Map<String, String> parsedData = new HashMap<>();
        boolean closed = true;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '[' && closed) {
                closed = false;
                delimiters.append(chars[i + 1]);
            } else if (chars[i] == ']' && !closed) {
                numbers = numbers.replace("["+ chars[i-1] + "]", "");
                closed = true;
            }
        }

        parsedData.put("parsedString", numbers.replace("//", ""));
        parsedData.put("delimiters", delimiters.toString());
        return parsedData;
    }

    private int getSumOfParsedStringNumbers(String numbers, String delimiters) {
        try {
            return Arrays.stream(
                    Arrays.stream(
                                    numbers.split("[" + delimiters + ",\n]")
                            )
                            .filter(item -> !item.isBlank())
                            .mapToInt(
                                    Integer::parseInt
                            )
                            .toArray()
            ).sum();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
