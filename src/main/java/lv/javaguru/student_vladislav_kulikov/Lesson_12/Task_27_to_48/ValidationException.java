package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

import java.util.Objects;

class ValidationException extends Exception {

    private String ruleName;
    private String description;
    private String fieldName;


    ValidationException(String ruleName, String description, String fieldName) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) && Objects.equals(description, that.description) && Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public String toString() {
        return "ValidationException{" +
                "ruleName='" + ruleName + '\'' +
                ", description='" + description + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}
