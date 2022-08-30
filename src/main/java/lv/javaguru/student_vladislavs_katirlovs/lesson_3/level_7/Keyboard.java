package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class Keyboard {

    String name;
    int keyNumber;
    boolean isLight;

    Keyboard(String name, int keyNumber, boolean isLight) {
        this.name = name;
        this.keyNumber = keyNumber;
        this.isLight = isLight;
    }

    public void turnOffLight() {
        isLight = false;
    }

    public void turnOnLight() {
        isLight = true;
    }

    public void updateKeyNumber(int newKeyNumber) {
        keyNumber = newKeyNumber;
    }

    public void keyboardDescription() {
        if (isLight) {
            System.out.println(name + " with " + keyNumber + " buttons is glowing");
        } else {
            System.out.println(name + " with " + keyNumber + " buttons is NOT glowing");
        }
    }
}
