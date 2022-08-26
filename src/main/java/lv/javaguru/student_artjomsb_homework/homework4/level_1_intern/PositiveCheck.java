package lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;

public class PositiveCheck {
    String positiveCheck(int number) {
        String result = "Number = 0";
        if (number > 0) result = "Positive";
        if (number < 0) result = "Negative";
        return result;
    }
}
