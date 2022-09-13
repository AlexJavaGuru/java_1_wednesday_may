package main.java.lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_1_intern;

public class SafeV2 {
    private double money;
    private final String password;

    public SafeV2(double money, String password) {
        this.money = money;
        this.password = password;
    }

    public void getMoney(double money, String password) {
        if (this.password.equals(password)) {
            this.money -= money;
        }
    }

    public void putMoney(double money, String password) {
        if (this.password.equals(password)) {
            this.money += money;
        }
    }
    public double howMuchMoney(){
        return money;
    }
}
