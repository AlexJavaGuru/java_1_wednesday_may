package main.java.lv.javaguru.teacher.lesson_10_collections.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        User alex = new User("Alex", "Ivanov", 876543);
        User notMe = new User("Someone", "Person", 11111);
        List<User> users = new LinkedList<>();

        users.add(alex);
        users.add(alex);
        users.add(alex);
        users.add(notMe);

        User user = users.get(1);
        System.out.println(user);

//        Iterator<User> iterator = users.iterator();
//        while(iterator.hasNext()) {
//            User next = iterator.next();
//            //some actions with nextUser;
//        }
        System.out.println(users.size());
    }
}
