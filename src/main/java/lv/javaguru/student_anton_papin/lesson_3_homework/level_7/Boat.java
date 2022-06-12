package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

 class Boat {
    String model;
    double size;
    Boolean isLaunched;

     Boat(String model, double size, boolean isLaunched){
        this.model = model;
        this.size =size;
        this.isLaunched = isLaunched;
    }
    void sail(){
        System.out.println("Sailing in the Sea");
    }
    void carry(){
        System.out.println("Carrying people and staff");
    }
    void drown(){
        System.out.println("Drowing to the bottom of the ocean");
    }

}
