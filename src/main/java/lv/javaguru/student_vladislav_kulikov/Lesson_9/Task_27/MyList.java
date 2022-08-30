package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_27;

interface MyList {

    void addElement(String element);
    // Добавляет элемент, который мы подаем в массив

    void addElementByIndex(String element, int position);
    // Метод добавляет элемент в массив по индексу(в начало, конец или в середину)

    boolean findWord(String word);
    // Проверяет есть ли такая строка в массиве

    int findIndexOfWord(String word);
    // Метод найдет индекс строки, которую мы передадим

    void deleteWord(String word);
    // Метод удалит строку, которую мы передадим

}
