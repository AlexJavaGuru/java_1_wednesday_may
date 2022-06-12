package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class BootleDemo {
    public static void main(String[] args) {
        Bottle bottle1= new Bottle("Black Label Johny Walker ", "Glass",0.7);
        bottle1.open();
        String label = bottle1.getLabel();
        String material = bottle1.getMaterial();
        double size = bottle1.getSize();
        System.out.println("Bootle`s label is  " + label);
        System.out.println("The bottle made of " + material);
        System.out.println("The bottle size is " + size);
        bottle1.close();

    }
}
