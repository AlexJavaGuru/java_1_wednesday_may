package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class DoorDemo {

    public static void main(String[] args) {

        Door door = new Door("Wood", 2.1, false);

        door.doorDescription();
        door.updateHeight(7.77);
        door.updateMaterial("Iron");
        door.openTheDoor();
        door.doorDescription();
    }

}
