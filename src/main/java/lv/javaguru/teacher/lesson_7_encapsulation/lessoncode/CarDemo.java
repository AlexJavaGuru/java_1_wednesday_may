package main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 300);
        Car car2 = car1;
        Car car3 = new Car("BMW", 300);

        if (car1.equals(car1)) { //true
            System.out.println("Car1 is equal Car1");
        }
        if (car1.equals(car2)) { //true
            System.out.println("Car1 is equal Car2");
        }
        if (car1.equals(car3)) { //false
            System.out.println("Car1 is equal Car3");
        }

        System.out.println(car1);

    }
}
