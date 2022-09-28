package lv.javaguru.student_daniels_demishins.lesson_3.lvl_5;

public class Dog {
    String name;
    int age;
    String color;
    String newcolor;

     Dog(String name, int age, String color,String newcolor){
        this.name = name;
        this.age = age;
        this.color = color;
        this.newcolor = newcolor;
    }
     void voice(){
        System.out.println("Wuf.... ");
        System.out.println(name + " " + name + " " + name);
        System.out.println("Yorick is " + age + " years old ");
    }
     void happyBirthday(){
        System.out.println("Happy Birthday");
    }
     void getAge() {
        System.out.println("Yorick is " + 3 + " years old");
    }
     void color(){
        System.out.println(color);
    }
     void changeColor(){
        System.out.println(newcolor);
    }
}
