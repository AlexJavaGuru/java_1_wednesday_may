package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

public class BranchingStatements {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i + "; ");
            i++;
        }
    }
}