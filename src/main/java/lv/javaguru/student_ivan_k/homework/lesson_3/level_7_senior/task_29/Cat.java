package lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_29;

 class Cat {

    String nameOfCat;
    int ageOfCat;
    Boolean isHungry;

     public Cat(String newNameOfCat, int newAgeOfCat, boolean newIsHungry) {
         this.nameOfCat = newNameOfCat;
         this.ageOfCat = newAgeOfCat;
         this.isHungry = newIsHungry;
     }

     void voice (){
         System.out.println("Meou, Meou");
         this.isHungry= true;
         System.out.println("Cat is hungry and he is " + ageOfCat + " days old!");
     }

     void eat (){
         System.out.println("Eating ......");
         this.isHungry= false;
     }

     void sleep (){
         System.out.println("Sleeping ...Xxxxxxx");
         this.ageOfCat= ageOfCat + 1;
     }

     String getNameOfCat(){
         return this.nameOfCat;
     }

     Boolean getIsHungry(){
         return this.isHungry;
     }


 }
