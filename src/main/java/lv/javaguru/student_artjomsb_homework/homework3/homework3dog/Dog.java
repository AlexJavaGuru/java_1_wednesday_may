package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3dog;

class Dog {
    private String dogName;
    int dogAge;
    String dogColor;
    Dog(String dogName, int dogAge,String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void voice(){
        for (int i = 0; i < 3; i++){
            System.out.print(dogName + " ");
        }
        System.out.println("Woof!");
    }
    void voiceNameAge(){
        System.out.println("Dog: " + dogName + ", Age: " + dogAge);
    }
    void setOlder(){
        System.out.println("Happy birthday! " + dogName);
        dogAge++;
    }
    void dogStatus(){
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog color: " + dogColor);
    }
    void changeColor (String dogColor){
        this.dogColor = dogColor;
    }
}
