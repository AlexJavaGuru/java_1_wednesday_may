package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_3_junior;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
