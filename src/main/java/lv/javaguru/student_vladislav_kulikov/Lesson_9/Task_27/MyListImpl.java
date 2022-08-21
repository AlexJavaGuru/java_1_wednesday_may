package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_27;

import java.util.List;

class MyListImpl implements MyList {

    List<String> stringList;

    MyListImpl(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void addElement(String element) {
        stringList.add(element);
    }

    @Override
    public void addElementByIndex(String element, int position) {
        stringList.add(position,element);
    }

    @Override
    public boolean findWord(String word) {
       return stringList.contains(word);
    }

    @Override
    public int findIndexOfWord(String word) {
        return stringList.indexOf(word);
    }

    @Override
    public void deleteWord(String word) {
        stringList.remove(word);
    }

    List<String> getStringList() {
        return stringList;
    }

}
