package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

public class DublicateValDemo {

    public static void main(String[] args) {
        List<DublicateValDemo> dublicateValDemosList = new ArrayList<>();
        DublicateValDemo dublicateValDemo = new DublicateValDemo();

        //task 4
        dublicateValDemosList.add(0, dublicateValDemo);
        dublicateValDemosList.add(1, dublicateValDemo);
    }
}
