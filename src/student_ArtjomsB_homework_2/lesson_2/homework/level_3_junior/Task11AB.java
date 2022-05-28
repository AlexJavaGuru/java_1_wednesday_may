package student_ArtjomsB_homework_2.lesson_2.homework.level_3_junior;
import java.util.Scanner;
public class Task11AB {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        //Array with 3 number initialization
        int[] num = new int[3];
        //Add variable sum
        int sum=0;
        //Cycle "For" to enter the 3 numbers and calculate sum
        for( int i=0; i<3;i++){
            System.out.print("Please, enter " + (i+1) + " number: ");
            num[i]= inp.nextInt();
            sum += num[i];
        }
        //Calculation of Middle arithmetic number
        double sr = sum / num.length;
        System.out.print("Middle arithmetic number =" + sr);
    }
}
