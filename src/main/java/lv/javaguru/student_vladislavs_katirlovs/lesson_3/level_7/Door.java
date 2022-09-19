package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

public class Door {

    String material;
    double height;
    boolean isOpen;

    Door(String material, double height, boolean isOpen) {
        this.material = material;
        this.height = height;
        this.isOpen = isOpen;
    }

    public void closeTheDoor() {
        isOpen = false;
    }

    public void openTheDoor() {
        isOpen = true;
    }

    public void updateMaterial(String newMaterial) {
        material = newMaterial;
    }

    public void updateHeight(double newHeight) {
        height = newHeight;
    }

    public void doorDescription() {
        if (isOpen) {
            System.out.println("Door made of " + material + " and " + height + " meters height is open");
        } else {
            System.out.println("Door made of " + material + " and " + height + " meters height is closed");
        }
    }
}
