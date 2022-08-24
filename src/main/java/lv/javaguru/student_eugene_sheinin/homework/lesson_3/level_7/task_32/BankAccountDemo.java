package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_32;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000.00);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
