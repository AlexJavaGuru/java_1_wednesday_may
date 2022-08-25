package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {

    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        while (true) {
            list.add(new String[10000]);
        }
    }
}
