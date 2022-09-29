package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

import java.util.List;

public interface ProductValidation {

    List<ValidationException> validate(Product product);
}
