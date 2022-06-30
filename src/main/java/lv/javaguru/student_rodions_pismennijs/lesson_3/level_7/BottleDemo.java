package main.java.lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

class BottleDemo {

    public static void main(String[] args) {

        Bottle bottle = new Bottle(true,true);

        bottle.status();
        bottle.open();
        bottle.status();
        bottle.drink();
        bottle.status();

        bottle.refill();
        bottle.close();
        bottle.status();

    }

}
