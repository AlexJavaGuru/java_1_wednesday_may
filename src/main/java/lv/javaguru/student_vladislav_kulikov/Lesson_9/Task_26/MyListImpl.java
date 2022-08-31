package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_26;

import java.util.Objects;

class MyListImpl implements MyList{

    String[] strings;

    MyListImpl(String[] strings) {
        this.strings = strings;
    }



    @Override
    public String[] makeArrayBigger() {
        String[] stringsCopy = new String[strings.length + 1];
        return stringsCopy;
    }

    @Override
    public String[] makeArraySmaller() {
        String[] stringsCopy = new String[strings.length - 1];
        return strings = stringsCopy;
    }

    @Override
    public String[] addElement(String element) {
        String[] stringsCopy = new String[strings.length +1];
        System.arraycopy(strings, 0, stringsCopy, 0, strings.length);

        for (int i = 0; i < stringsCopy.length; i++) {
            if(stringsCopy[i] == null) {
                stringsCopy[i] = element;
                break;
            }
        }
        return strings = stringsCopy;
    }

    @Override
    public String[] addElementByIndex(String element, int position) {
        if(strings.length >= position+1 && position >= 0) {
            if (element != null) {
                String[] stringsCopy = makeArrayBigger();
                stringsCopy[position] = element;
                return strings = stringsCopy;
            }
        }
        return strings;
    }

    @Override
    public boolean findWord(String word) {
        for (String string : strings) {
            if (Objects.equals(string, word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int findIndexOfWord(String word) {
        for (int i = 0; i < strings.length; i++) {
            if (Objects.equals(strings[i], word)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String[] deleteWord(String word) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i] == word) {
                    strings[i] = null;
                    cleanNull();
                    return strings;
                }
            }
        return strings;
    }
    private void cleanNull() {
        int count = 0;

        for (String string : strings) {
            if (string != null) {
                count++;
            }
        }
        String[] stringsCopy = new String[count];
        int i = 0;

        for (String book : strings) {
            if (book != null) {
                stringsCopy[i] = book;
                i++;
            }
        }
        strings = stringsCopy;
    }

}



