package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class KeyboardDemo {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard("Razer", 77, true);

        keyboard.turnOffLight();
        keyboard.keyboardDescription();
        keyboard.turnOnLight();
        keyboard.updateKeyNumber(12345);
        keyboard.keyboardDescription();
    }

}
