package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_1 {

    List<String> arrayList = new ArrayList<>();
    // ArrayList позволяет быстрее найти нужный объект чем linkedList
    // Тратит больше времени на добавление и удаление объектов
    // а также занимает меньше памяти чем linkedList

    List<String> linkedList = new LinkedList<>();
    // LinkedList позволяет быстрее добавлять и удалять объекты, но занимает больше времени чтобы найти объект
    // также занимает больше памяти чем ArrayList
}
