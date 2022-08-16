package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class Debt {

    private User user;
    private int dayOfTheDebt;

    Debt(User user) {
        this.user = user;
    }

    void payDebt() {
        if(user.getDebt() > 0) {
            System.out.println("You paid off your debt " + user.getDebt());
            user.setDebt(0);
        }
    }

    void timer() {
        this.dayOfTheDebt -= 1;
    }

    void checkTimer() {
        if (dayOfTheDebt == 3) {
            System.out.println(user.getName() + " You need to pay the debt in 3 days");
        }
        if(dayOfTheDebt == 0) {
            System.out.println(user.getName() + " You need to pay debt today!!!");
            user.setDebt(user.getDebt() +100);
            System.out.println(user.getName() + " You have debt: " + user.getDebt() + "!!!");
        }
    }
    int getDayOfTheDebt() {
        return dayOfTheDebt;
    }

    void setDayOfTheDebt(int dayOfTheDebt) {
        this.dayOfTheDebt = dayOfTheDebt;
    }
}

