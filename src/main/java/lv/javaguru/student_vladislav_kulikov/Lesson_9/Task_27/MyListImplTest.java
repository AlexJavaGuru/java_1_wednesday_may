package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_27;

import java.util.LinkedList;
import java.util.List;

class MyListImplTest {

    public static void main(String[] args) {
        addElement();
        addElementByIndex();
        findWord();
        findIndexOfWord();
        deleteWord();
    }

    static void addElement(){
        List<String> stringList = new LinkedList<>();
        MyListImpl myList = new MyListImpl(stringList);
        String word = "Hello";
        myList.addElement(word);
        List<String> result = myList.getStringList();
        check(result.contains(word), "Add Element Test");
    }

    static void addElementByIndex() {
        List<String> stringList = new LinkedList<>();
        MyListImpl myList = new MyListImpl(stringList);
        String word = "Hello";
        myList.addElementByIndex(word,0);
        List<String> result = myList.getStringList();
        check(result.indexOf(word) == 0, "Add Element By Index Test");
    }

    static void findWord() {
        List<String> stringList = new LinkedList<>();
        MyListImpl myList = new MyListImpl(stringList);
        myList.addElement("Dog");
        myList.addElement("Cat");
        myList.addElement("Rat");
        boolean result = myList.findWord("Dog");
        check(result, "Find Word Test");
    }

    static void findIndexOfWord() {
        List<String> stringList = new LinkedList<>();
        MyListImpl myList = new MyListImpl(stringList);
        myList.addElement("Dog");
        myList.addElement("Cat");
        myList.addElement("Rat");
        int result = myList.findIndexOfWord("Dog");
        check(result == 0, "Find Index Of Word Test");
    }

    static void deleteWord() {
        List<String> stringList = new LinkedList<>();
        MyListImpl myList = new MyListImpl(stringList);
        myList.addElement("Dog");
        myList.addElement("Cat");
        myList.addElement("Rat");
        myList.deleteWord("Cat");
        List<String > result = myList.getStringList();
        check(!result.contains("Cat"), "Find Word Test");
    }

    static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}