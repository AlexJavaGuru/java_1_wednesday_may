package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

import java.util.ArrayList;

interface MyList {
    void sortMinMax(ArrayList<Integer> array); //сортировка по возрастанию

    void sortMaxMin(ArrayList<Integer> array); //сортировка по убыванию

    int getArraySize(ArrayList<Integer> array); //узнать размер массива

    void deleteNumberByID(ArrayList<Integer> array, int id); //удаляет число из массива под указанным номером

    void deleteNumber(ArrayList<Integer> array, int number); //удаляет число из массива

    int findMostFrequentNumber(ArrayList<Integer> array); //найти наиболее встречаемое число

    void addNumber(ArrayList<Integer> array, int number);// добавить число

    void increaseArraySize(ArrayList<Integer> array, int plusSize);// задаётся число на сколько увеличить размер массива
}
