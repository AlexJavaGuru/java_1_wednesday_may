package lv.javaguru.student_vadims_vilhovojs.lesson_3.task_29;

class Parrot {
    String name;
    String colour;
    boolean isHungry;

    public Parrot(String name,String colour, boolean isHungry) {
        this.name = name;
        this.colour = colour;
        this.isHungry = isHungry;
    }
    void voice(){
        System.out.println("Hello , my name is " + name);
    }
    void colour(){
        System.out.println("Parrot`s colour is " + colour);
    }
    void fly(){
        System.out.println(name + " starts flying");
    }
    void eat(){
        System.out.println(name + " eating some banana");
        isHungry = false;
    }


}
