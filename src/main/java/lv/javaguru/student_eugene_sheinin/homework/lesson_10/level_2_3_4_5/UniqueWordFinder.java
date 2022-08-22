package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {

         return new HashSet<String>(
                 Arrays.asList(
                         text.split(" ")
                 )
         );
    }
}
