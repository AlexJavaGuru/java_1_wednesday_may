package lv.javaguru.teacher.lesson_9_interfaces.lessoncode.boxexample;

public interface BoxService {

    boolean putItemIntoTheBox(Box box, Item item, int position);

    int getNextPosition(Box box);

    void sort(Box box);

    default boolean closeTheBox(Box box) {
        System.out.println("This method is not implemented here");
        return false;
    }

}

