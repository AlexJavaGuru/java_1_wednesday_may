package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;


public class ValidationException extends Throwable {

    private String ruleName;


    private String description;


    private String fieldName;

    // создайте конструктор

    // создайте только get

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
