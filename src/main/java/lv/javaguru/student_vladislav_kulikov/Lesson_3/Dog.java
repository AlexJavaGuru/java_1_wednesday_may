package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_3;

class Dog {

     String name;
     int age;
     String color;

     Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice(){
        int i = 0;
        while (i < 3){
            System.out.println("Wuf");
            i++;
        }

        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

     void happyBirthday(){
         this.age = age + 1;
     }

    void changeColor(String newColor){
         this.color = newColor;
    }

     String getName(){
         return name;
    }
}
