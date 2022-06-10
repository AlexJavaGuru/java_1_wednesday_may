package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_29;

public class BankAccount {

   private String bankName;
   private   String name;
    int money;
    String date;

    BankAccount(String bankName, String name, int money, String date){
        this.bankName = bankName;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    void inComMoney(){
        this.money = money + 10000;
        System.out.println("Received to your account : 10000");
    }

    void outGoMoney(){
        this.money = money - 5000;
        System.out.println("Transferred from your account : -5000");
    }

    void updateDate(){
        date = "17/2/23";
        System.out.println("Your date has been updated: " + date);
    }

    String getBankName(){
        return bankName;
    }

    String getName(){
        return name;
    }
}
