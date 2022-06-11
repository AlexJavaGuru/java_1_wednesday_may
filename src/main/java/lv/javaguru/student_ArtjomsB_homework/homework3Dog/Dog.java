package main.java.lv.javaguru.student_ArtjomsB_homework.homework3Dog;

public class Dog {
    private String dogName;
    public Dog(String dogName){
        this.dogName = dogName;
    }
    public void voice(){
        for (int i = 0; i < 3; i++){
            System.out.print(dogName + " ");
        }
        System.out.println("Woof!");
    }
}
