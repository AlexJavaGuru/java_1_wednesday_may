package main.java.lv.javaguru.teacher.lesson_4_if_statement.lessoncode.basicteatapproach;

public class ColorDetector {

    public String detect(int length) {
        String result;

        if (length > 400 && length <= 500) {
            result = "Red";
        } else if (length > 500 && length <= 600) {
            result = "Blue";
        } else if (length > 600 && length <= 700) {
            result = "Green";
        } else {
            result = "Invisible";
        }
        return result;
    }

}
