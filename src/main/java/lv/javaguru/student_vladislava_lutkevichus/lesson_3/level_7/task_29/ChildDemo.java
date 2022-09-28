package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_7.task_29;

public class ChildDemo {

    public static void main(String[] args) {

        Child myChild = new Child("Polina", "brown", 4);
        System.out.println(myChild.getName() + " " + myChild.age);

        myChild.setAge(4);
        System.out.println(myChild.getName() + " " + myChild.age);

        myChild.childFacts();

        myChild.changeHairColor("dark-brown");
        myChild.happyBirthday();

        myChild.childFacts();

    }
}
