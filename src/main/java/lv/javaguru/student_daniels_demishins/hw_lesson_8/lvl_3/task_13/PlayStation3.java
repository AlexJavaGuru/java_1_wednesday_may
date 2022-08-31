package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_3.task_13;

public class PlayStation3 extends PlayStation2 {
    private String sonyNavigationController;

    public PlayStation3(String color, String brand, int controllers, String sonyNavigationController) {
        super(color, brand, controllers);
        this.sonyNavigationController = sonyNavigationController;
    }

    @Override
    public int setControllers() {
        return super.setControllers();
    }

    @Override
    void memorySize() {
        System.out.println("Memory size is 250 GB");
    }

    @Override
    void gamesAmount() {
        System.out.println("Games amount is 4332");
    }
}
