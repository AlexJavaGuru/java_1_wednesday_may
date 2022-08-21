package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_26;

import java.util.Objects;

class MyListTest {

    public static void main(String[] args) {
        makeArrayBigger();
        makeArraySmaller();
        addElement();
        noAddElement();
        addElementByIndex();
        noAddElementByIndex();
        findWord();
        noFindWord();
        findIndexOfWord();
        noFindIndexOfWord();
        deleteWord();
        noDeleteWord();

    }

    static void makeArrayBigger() {
        String[] strings = new String[0];
        MyListImpl myList = new MyListImpl(strings);

        String[] result = myList.makeArrayBigger();

        check(result.length > strings.length, "Make Array Bigger Test");
    }

    static void makeArraySmaller() {
        String[] strings = new String[10];
        MyListImpl myList = new MyListImpl(strings);

        String[] result = myList.makeArraySmaller();

        check(result.length < strings.length, "Make Array Smaller Test");
    }

    static void addElement() {
        String[] strings = new String[2];
        MyListImpl myList = new MyListImpl(strings);
        String[] result = myList.addElement("Hello");

        for (String string : result) {
            if (string == "Hello") {
                System.out.println("Add Element = OK");
            } else {
                System.out.println("Add Element = FAILED");
            }
            break;
        }
    }

    static void noAddElement() {
        String[] strings = new String[2];
        MyListImpl myList = new MyListImpl(strings);
        String[] result = myList.addElement(null);

        for (String string : result) {
            if (string == null) {
                System.out.println("(False)No Add Element = OK");
            } else {
                System.out.println("(False)No Add Element = FAILED");
            }
            break;
        }
    }

    static void addElementByIndex() {
        String[] strings = new String[2];
        MyListImpl myList = new MyListImpl(strings);
        String[] result = myList.addElementByIndex("Hello", 1);
        if (result[1] == "Hello") {
            System.out.println("Add Element By Index = OK");
        } else {
            System.out.println("Add Element By Index = FAILED");
        }
    }

    static void noAddElementByIndex() {
        String[] strings = new String[2];
        MyListImpl myList = new MyListImpl(strings);
        String[] result = myList.addElementByIndex("Hello", -1);

        if (result[1] == null) {
            System.out.println("(False) No Add Element By Index = OK");
        } else {
            System.out.println("(False) No Add Element By Index = FAILED");
        }
    }

    static void findWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);

        myList.addElement("Hello");
        myList.addElement("World");

        boolean result = myList.findWord("Hello");

        check(result, "Find Word");
    }

    static void noFindWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);
        boolean result = myList.findWord("Hello");
        check(!result, "(False) Find Word");
    }

    static void findIndexOfWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);

        myList.addElement("Hello");
        myList.addElement("World");

        int index = myList.findIndexOfWord("Hello");
        check(index == 0, "Find Index Of Word");
    }

    static void noFindIndexOfWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);

        myList.addElement("World");

        int index = myList.findIndexOfWord("Hello");
        check(index == -1, "(False) Find Index Of Word");
    }

    static void deleteWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);
        myList.addElement("Hello");
        myList.addElement("World");

        String[] result = myList.deleteWord("Hello");

        for (String string : result) {
            if (!Objects.equals(string, "Hello")) {
                System.out.println("Delete Word = OK");
            } else {
                System.out.println("Delete Word = FAILED");
            }
        }
    }

    static void noDeleteWord() {
        String[] strings = new String[1];
        MyListImpl myList = new MyListImpl(strings);

        myList.addElement("Hello");
        String[] result = myList.deleteWord("World");

        for (String string : result) {
            if (!Objects.equals(string, "World")) {
                System.out.println("(False) Delete Word = OK");
            } else {
                System.out.println("(False) Delete Word = FAILED");
            }
            break;
        }
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
