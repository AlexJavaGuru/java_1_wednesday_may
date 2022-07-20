package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

class Palindrome {
    private String text;

    boolean isPalindrome() {
        toLowerCase();
        deleteSpacing();
        String[] textInArray = stringToArray();
        return isMassivePalindrome(textInArray);
    }

    boolean isMassivePalindrome(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[array.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    void toLowerCase() {
        text = text.toLowerCase();
    }

    void deleteSpacing() {
        text = text.replaceAll("\\s+", "");
    }

    String[] stringToArray() {
        return text.split("");
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
