package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_5_middle;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}