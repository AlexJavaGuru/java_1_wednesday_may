package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_26;

import java.util.Arrays;

class MyListDemo {

    public static void main(String[] args) {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);

        myList.addElement("Hello");
        System.out.println(Arrays.toString(strings));
    }

}
