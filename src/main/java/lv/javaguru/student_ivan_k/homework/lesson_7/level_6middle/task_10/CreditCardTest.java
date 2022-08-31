package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest runner = new CreditCardTest();


    }

    public void testDeposite(){
        CreditCard creditCard = new CreditCard(123456789012L,8888);
        int pinCode = 8888;
        creditCard.deposit(8888,100);
    }
}
