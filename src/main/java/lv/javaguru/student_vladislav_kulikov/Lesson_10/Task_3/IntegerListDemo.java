package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_3;

import java.util.LinkedList;
import java.util.List;

class IntegerListDemo {


    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(0,1);
        integerList.add(4,5);

        System.out.println(integerList.size());

        integerList.remove(1);

        integerList.remove(integerList.indexOf(4));

        System.out.println(integerList.isEmpty());
        for (Integer integer: integerList) {
            System.out.println(integer);
        }

    }

}
