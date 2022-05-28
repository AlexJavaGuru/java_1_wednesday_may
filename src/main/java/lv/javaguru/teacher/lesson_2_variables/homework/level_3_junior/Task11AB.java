package main.java.lv.javaguru.teacher.lesson_2_variables.homework.level_3_junior;
import java.util.Scanner;
public class Task11AB {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        //System.out.print("Vvedite tri chisla:");
        //int[] num = {inp.nextInt(),inp.nextInt(),inp.nextInt()};
        int[] num = new int[3];
        int sum=0;
        for( int i=0; i<3;i++){
            System.out.print("Vvedite " + (i+1) + " chislo: ");
            num[i]= inp.nextInt();
            sum += num[i];
        }
        double sr = sum / num.length;
        System.out.print("Srednee chislo =" + sr);
    }
}
