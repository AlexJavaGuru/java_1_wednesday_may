package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        try{
           while (true) {
               String string = "rrr";
               stringList.add(string);
           }
        }catch(OutOfMemoryError e) {
            System.out.println("Out of memory!");
        }
    }


}
