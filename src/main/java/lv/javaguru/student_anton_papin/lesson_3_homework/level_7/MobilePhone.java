package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

class MobilePhone {
    String model;
    int price;
    Boolean isWaterproof;

    MobilePhone(String model, int price, boolean isWaterproof) {
        this.model = model;
        this.price = price;
        this.isWaterproof = isWaterproof;

    }

    void ring() {
        System.out.println("Din`Don");
    }

    void vibrate() {
        System.out.println("Bzzzzzz");
    }

    void blink() {
        System.out.println("Blink-Blink");
    }

    void model() {
    }
}