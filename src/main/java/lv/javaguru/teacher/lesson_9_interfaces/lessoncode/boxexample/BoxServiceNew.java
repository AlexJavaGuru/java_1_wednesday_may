package lv.javaguru.teacher.lesson_9_interfaces.lessoncode.boxexample;

import java.util.Random;

public class BoxServiceNew implements BoxService {

    @Override
    public boolean putItemIntoTheBox(Box box, Item item, int position) {
        System.out.println("Putting item 1000 times faster");
        //position is required
        int nextPosition = getNextPosition(box);
        return true;
    }

    @Override
    public int getNextPosition(Box box) {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public void sort(Box box) {
        System.out.println("Sorting the box");
    }

}
