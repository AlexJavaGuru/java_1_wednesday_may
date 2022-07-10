package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_5_middle;

 class Dog {


    private String nameOfDog;
    private int age;
    public String colorOfDog;

    public Dog(String nameOfDog,int age, String colorOfDog){
        this.nameOfDog = nameOfDog;
        this.age = age;
        this.colorOfDog = colorOfDog;


    }

    public String getNameOfDog(){
        return nameOfDog;
    }
    public int getAge(){
        return age;
    }

    void vois() {
        System.out.println(nameOfDog);
        System.out.println(nameOfDog);
        System.out.println("Dog name is " + nameOfDog  + ", she is " + age + " years old. She is "
        + colorOfDog);

    }
    void celBirthday(){

        System.out.println("Celebrate a birthday ......");
        age = age + 1;
    }

    public void changeColor (String newColor) {
        this.colorOfDog = newColor;
    }
}
