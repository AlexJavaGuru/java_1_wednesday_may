package lv.javaguru.teacher.lesson_9_interfaces.lessoncode.boxexample;

import java.util.Random;

public class BoxServiceOld implements BoxService {

    @Override
    public boolean putItemIntoTheBox(Box box, Item item, int position) {
        System.out.println("We are making it slowly but stable");
        return true;
    }

    @Override
    public int getNextPosition(Box box) {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public void sort(Box box) {
        System.out.println("Slowly sorting...");
    }

    @Override
    public boolean closeTheBox(Box box) {
        System.out.println("Closing the box");
        return true;
    }

}
