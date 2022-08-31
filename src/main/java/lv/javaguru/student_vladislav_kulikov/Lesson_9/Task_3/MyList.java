package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_3;

interface MyList {

    String[] makeArrayBigger(String [] array);
    // Этот метод расширит массив
    // Если место в массиве заканчивается, то при добавлении новой строки будет создаваться новый массив

    String[] makeArraySmall(String [] array);
    // Этот метод уменьшит массив, если есть пустое место, когда оно не нужно

    String[] addElement(String[] array, String element);
    // Добавляет элемент, который мы подаем в массив

    String[] addElementCustom(String[] array, String element, int position);
    // Метод добавляет элемент в массив по индексу(в начало, конец или в середину)

    boolean findWord(String[] array, String word);
    // Проверяет есть ли такая строка в массиве

    int findIndexOfWord(String[] array, String word);
    // Метод найдет индекс строки, которую мы передадим

    String[] deleteWord(String[] array, String word);
    // Метод удалит строку, которую мы передадим

}
