package lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

class BankAccountTwo {
    String owner;
    int money;

    BankAccountTwo(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
