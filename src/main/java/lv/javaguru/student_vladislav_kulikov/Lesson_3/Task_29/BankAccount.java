package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_3.Task_29;

public class BankAccount {

    String bankName;
    String name;
    int money;
    String date;

    BankAccount(String bankName, String name, int money, String date){
        this.bankName = bankName;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    void inMoney(int inMoney){
        int sum = this.money + inMoney;
        System.out.println("Received to your account : "+ inMoney);
        System.out.println("Remainder: " + sum);
        this.money = sum;
    }

    void outMoney(int outMoney){
       int sum = this.money - outMoney;
        System.out.println("Transferred from your account : -" + outMoney);
        System.out.println("Remainder: " +sum);
        this.money = sum;
    }

    void updateDate(String date){
        this.date = date;
        System.out.println("Your date has been updated: " + date);
    }

    String getBankName(){
        return bankName;
    }

    String getName(){
        return name;
    }
}
