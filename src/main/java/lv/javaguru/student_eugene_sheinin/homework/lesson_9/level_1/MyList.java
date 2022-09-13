package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_1;

import java.util.List;

interface MyList<E> {

    public E get(int index);

    public int getIndexOf(E element);

    public void add(E element);

    public void delete(int index);

    public void sort();

    public void contains();

    public int size();
}
