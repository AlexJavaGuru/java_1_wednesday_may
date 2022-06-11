package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_5;

public class Dog {
    String name;
    int age;
    String color;
    String newcolor;

    public Dog(String name, int age, String color,String newcolor){
        this.name=name;
        this.age=age;
        this.color=color;
        this.newcolor=newcolor;
    }
    public void voice(){
        System.out.println("Wuf.... ");
        System.out.println(name+" "+name+" "+name);
        System.out.println("Yorick is "+age+" years old ");
    }
    public void happyBirthday(){
        System.out.println("Happy Birthday");
    }
    public void getAge() {
        System.out.println("Yorick is "+3+" years old");
    }
    public void color(){
        System.out.println(color);
    }
    public void changeColor(){
        System.out.println(newcolor);
    }
}
