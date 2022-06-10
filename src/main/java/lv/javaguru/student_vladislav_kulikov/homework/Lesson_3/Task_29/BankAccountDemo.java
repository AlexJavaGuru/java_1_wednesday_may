package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_29;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Luminor", "Vladislav Kulikov", 1000000, "12/12/22");

        System.out.println("Bank name - " + myAccount.getBankName());
        System.out.println("Name - " + myAccount.getName());
        System.out.println("Balance - " + myAccount.money);
        System.out.println("Best before date - " + myAccount.date);

        myAccount.inComMoney();
        System.out.println(myAccount.money);

        myAccount.outGoMoney();
        System.out.println(myAccount.money);

        myAccount.updateDate();
    }
}
