package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_2 {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<User> userList = new LinkedList<>();
        List<Integer> integerList = new LinkedList<>();
        User user = new User("Example", "Example");


        userList.add(user);

        stringList.add("Hello");

        integerList.add(1);

        //java.util.List хранит не только ссылки на объекты но и примитивный тип данных
    }
}
