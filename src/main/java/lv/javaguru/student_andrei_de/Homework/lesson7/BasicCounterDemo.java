package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;


class BasicCounterDemo {


    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.decrement();
        counter.increment();

        System.out.println(counter.getCount());

        counter.setCounterValue(-100);
        System.out.println(counter.getCount());
    }
}
