package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(123456789012L, 8888);
        creditCard.setCreditLimit(500);
        creditCard.deposit(8888,100);
        System.out.println(creditCard.getBalance());
        creditCard.withdraw(8888,90);
        System.out.println(creditCard.getBalance());
        creditCard.withdraw(8888,100);
        System.out.println(creditCard.getBalance());
        System.out.println(creditCard.getCreditArrear());
        creditCard.withdraw(8888,410);
        System.out.println(creditCard.getCreditArrear());
        creditCard.deposit(8888,500);
        System.out.println(creditCard.getBalance());
        System.out.println(creditCard.getCreditArrear());









    }
}
