package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

interface MyList {
    void sortMinMax(List<Integer> array); //сортировка по возрастанию

    void sortMaxMin(List<Integer> array); //сортировка по убыванию

    int getArraySize(List<Integer> array); //узнать размер массива

    void deleteNumberByID(List<Integer> array, int id); //удаляет число из массива под указанным номером

    void deleteNumber(List<Integer> array, int number); //удаляет число из массива

    int findMostFrequentNumber(List<Integer> array); //найти наиболее встречаемое число

    void addNumber(List<Integer> array, int number);// добавить число

    void increaseArraySize(ArrayList<Integer> array, int plusSize);// задаётся число на сколько увеличить размер массива

}
