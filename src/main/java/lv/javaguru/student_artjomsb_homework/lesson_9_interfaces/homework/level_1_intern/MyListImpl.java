package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

import java.util.ArrayList;
import java.util.Collections;

class MyListImpl implements MyList {
    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    public void sortMinMax(ArrayList<Integer> array) {
        Collections.sort(numbers);
    }

    @Override
    public void sortMaxMin(ArrayList<Integer> array) {
        numbers.sort(Collections.reverseOrder());
    }

    @Override
    public int getArraySize(ArrayList<Integer> array) {
        return numbers.size();
    }

    @Override
    public void deleteNumberByID(ArrayList<Integer> array, int id) {
        numbers.remove(id);
    }

    @Override
    public void deleteNumber(ArrayList<Integer> array, int number) {
        numbers.remove(Integer.valueOf(number));
    }

    @Override
    public int findMostFrequentNumber(ArrayList<Integer> array) {
        return numbers.ret;
    }

    @Override
    public void addNumber(ArrayList<Integer> array, int number) {

    }

    @Override
    public void increaseArraySize(ArrayList<Integer> array, int plusSize) {
    }
}
