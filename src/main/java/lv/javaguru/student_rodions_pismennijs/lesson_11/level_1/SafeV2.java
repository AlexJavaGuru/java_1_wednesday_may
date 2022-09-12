package lv.javaguru.student_rodions_pismennijs.lesson_11.level_1;

public class SafeV2 {

    private final int password;
    private int money;

    public SafeV2(int password, int money) {
        this.password = password;
        this.money = money;
    }

    public void getMoney(int password, int money) {
        if (this.password == password) {
            this.money -= money;
        }
    }

    public void putMoney(int password, int money) {
        if (this.password == password) {
            this.money += money;
        }
    }

    @Override
    public String toString() {
        return "SafeV2{" +
                "password=" + password +
                ", money=" + money +
                '}';
    }
}
