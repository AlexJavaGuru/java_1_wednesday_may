package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_1;

interface MyList {

    int getArraySize(int[] array);
    // узнать размер массива

    void addNumber(int[] array, int number);
    // добавить число, которое будет подаваться в массив

    void deleteNumber(int[] array, int id);
    // удалить число по айдишнику

    int findNumber(int[] array, int number);
    // найти определённое число (или его отсутствие) в массиве

    int findNumberID(int[] array, int number);
    // найти айдишник определённого числа в массиве

    int findMostFrequentNumber(int[] array, int number);
    // найти самое повторяющееся число в массиве

    void increaseArray(int[] array);
    // увеличить массив

    void decreaseArray(int[] array);
    // уменьшить массив
}
