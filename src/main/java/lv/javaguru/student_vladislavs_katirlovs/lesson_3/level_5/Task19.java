package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogTwo {

    String name;
    int age;

    DogTwo(String name, int age){
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println(name + age);
    }
}

class DogTwoDemo {

    public static void main(String[] args) {
        DogTwo barsik = new DogTwo("Barsik ", 4);
        DogTwo fedor = new DogTwo("Fedor ", 17);

        barsik.voice();
        fedor.voice();
    }
}
