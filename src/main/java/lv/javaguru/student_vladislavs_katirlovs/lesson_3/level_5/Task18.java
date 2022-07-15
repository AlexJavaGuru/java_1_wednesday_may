package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class Dog {

    private String name;

    Dog(String name) {
        this.name = name;
    }

        void voice() {
            System.out.println(name + name + name);
        }
}

class DogDemo {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex ");
        Dog petya = new Dog("Petya ");

        rex.voice();
        petya.voice();
    }
}
