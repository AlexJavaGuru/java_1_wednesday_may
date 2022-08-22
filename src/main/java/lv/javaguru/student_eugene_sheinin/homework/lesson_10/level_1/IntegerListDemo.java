package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        //task 3
        List<Integer> integers  = new ArrayList<>();
        integers.add(0, 1);
        integers.add(2);
        integers.size();
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.isEmpty();

        //remove by index
        integers.remove(0);

        //remove object
        integers.remove((Integer) 2);
    }
}
