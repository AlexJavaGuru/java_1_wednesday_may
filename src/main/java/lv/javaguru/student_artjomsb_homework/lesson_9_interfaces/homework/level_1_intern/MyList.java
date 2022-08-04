package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

interface MyList {
    void sortMinMax(int[] array); //сортировка по возрастанию

    void sortMaxMin(int[] array); //сортировка по убыванию

    int getArraySize(int[] array); //узнать размер массива

    void deleteNumber(int[] array, int id); //удаляет число из массива под указанным номером

    int findMostFrequentNumber(int[] array); //найти наиболее встречаемое число

    void addNumber(int[] array, int number);// добавить число

    void increaseArraySize(int[] array, int plusSize);// задаётся число на сколько увеличить размер массива
}
