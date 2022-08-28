package lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

class BoatDemo {
    public static void main(String[] args) {
        Boat myBoat = new Boat("Yamaha", 144.2, true);
        myBoat.carry();
        myBoat.sail();
        myBoat.drown();
    }
}
