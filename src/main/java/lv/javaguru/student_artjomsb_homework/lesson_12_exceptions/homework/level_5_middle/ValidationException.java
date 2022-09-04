package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

class ValidationException extends Exception {
    private String ruleName;

    private String description;

    private String fieldName;

    public ValidationException(String message, String ruleName, String description, String fieldName) {
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