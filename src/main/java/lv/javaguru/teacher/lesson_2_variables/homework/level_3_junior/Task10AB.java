package main.java.lv.javaguru.teacher.lesson_2_variables.homework.level_3_junior;
import java.util.Scanner;
public class Task10AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //zapros radiusa
        System.out.print("Vvedite radius:");
        double r = inp.nextDouble();
        //vichislenie perimetra
        double p = 2 * Math.PI * r;
        //dve cifri posle zapyatoi
        String per = String.format("%.2f",p);
        //vichislenie ploshadi
        double s = Math.PI * Math.pow(r,2);
        //dve cifri posle zapyatoi
        String area = String.format("%.2f",s);
        //vivod dannih
        System.out.println("Perimetr = "+ per);
        System.out.println("Area = " + area);
    }
}
