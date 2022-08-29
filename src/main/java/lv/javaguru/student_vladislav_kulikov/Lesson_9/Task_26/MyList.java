package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_26;

interface MyList {

    String[] makeArrayBigger();
    // Этот метод расширит массив
    // Если место в массиве заканчивается, то при добавлении новой строки будет создаваться новый массив

    String[] makeArraySmaller();
    // Этот метод уменьшит массив, если есть пустое место, когда оно не нужно

    String[] addElement(String element);
    // Добавляет элемент, который мы подаем в массив

    String[] addElementByIndex(String element, int position);
    // Метод добавляет элемент в массив по индексу(в начало, конец или в середину)

    boolean findWord(String word);
    // Проверяет есть ли такая строка в массиве

    int findIndexOfWord(String word);
    // Метод найдет индекс строки, которую мы передадим

    String[] deleteWord(String word);
    // Метод удалит строку, которую мы передадим

}
