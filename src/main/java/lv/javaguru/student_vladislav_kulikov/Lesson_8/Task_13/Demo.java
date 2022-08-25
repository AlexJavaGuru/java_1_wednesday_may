package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_13;

class Demo {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("Brabus 850", 2022, 350, 0);
        Bmw bmwM5 = new Bmw("M5", 2015, 290, 0);
        Car subaru = new Subaru("Impreza STI", 2012, 400, 0);
        System.out.println(mercedes);
        System.out.println(bmwM5);
        System.out.println(subaru);

        mercedes.onMusic();
        mercedes.increaseSpeed();
        System.out.println(mercedes.currentSpeed);
        mercedes.isCarHaveTuning(true);
        mercedes.slowDown();
        mercedes.offMusic();
        System.out.println("___________");

        bmwM5.onAndOffInteriorLighting(true);
        bmwM5.increaseSpeed();
        System.out.println(bmwM5.currentSpeed);
        bmwM5.isCarHaveTuning(false);
        bmwM5.slowDown();
        System.out.println("___________");

        subaru.increaseSpeed();
        System.out.println(subaru.currentSpeed);
        subaru.isCarHaveTuning(true);
        subaru.slowDown();
        System.out.println("___________");


    }
}

