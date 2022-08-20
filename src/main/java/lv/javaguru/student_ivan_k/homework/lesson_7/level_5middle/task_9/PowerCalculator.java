package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_5middle.task_9;

import java.util.Scanner;

class PowerCalculator {

    public double exponentation (){
            double number = getOfNumber();
            double degree = getDegree();


            return calculationTwo(number, degree);

    }

    private double getOfNumber (){
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter number: ");

        return scr.nextDouble();
    }

    private double getDegree(){
        boolean flag = true;
        double degree = 1.0;
        do {
            Scanner scr = new Scanner(System.in);
            System.out.print("Please enter degree: ");
            degree = scr.nextDouble();
            if(degree <= 0){
                System.out.println("Degree cannot be less or equal to zero");
            }else {
                flag = false;
            }

        }while (flag);

        return degree;
    }

    private double calculation (double number, double degree){

        return  Math.pow(number, degree);

    }

    public  double calculationTwo ( double number, double degree){
        double result = 1.0;
        for (double i = 1; i <= degree; i++) {
             result  *=  number;
        }
        return result;
    }



}
