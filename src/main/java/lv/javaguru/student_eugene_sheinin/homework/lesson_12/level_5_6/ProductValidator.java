package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_5_6;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
