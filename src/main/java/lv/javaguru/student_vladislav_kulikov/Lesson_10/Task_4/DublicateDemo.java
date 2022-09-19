package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_4;

import java.util.ArrayList;
import java.util.List;

class DublicateDemo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(1);
        integerList.add(1);


        for (int integer: integerList) {
            System.out.println(integer);
        }
    }
}
