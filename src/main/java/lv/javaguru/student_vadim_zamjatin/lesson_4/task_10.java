package lv.javaguru.student_vadim_zamjatin.lesson_4;



import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int max;
            System.out.println("Input First number: ");
            int a = sc.nextInt();
            System.out.println("Input Second number: ");
            int b = sc.nextInt();
            System.out.println("Input Third number: ");
            int c = sc.nextInt();

            max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("Max number = " + max);
        }

    }


