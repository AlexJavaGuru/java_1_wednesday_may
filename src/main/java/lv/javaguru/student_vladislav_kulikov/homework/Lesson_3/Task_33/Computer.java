package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_33;
//Дописать код программы, что бы она запускалась
//    и выводила на консоль производителя и модель компьютера.
//    Менять можно только класс Computer.
public class Computer {

        String manufacturer;
        String model;

        Computer(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }
        String getManufacturer(){
            return manufacturer;
        }

        String getModel(){
            return model;
        }

}
