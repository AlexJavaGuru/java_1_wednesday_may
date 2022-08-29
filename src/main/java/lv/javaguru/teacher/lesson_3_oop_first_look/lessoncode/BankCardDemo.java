package lv.javaguru.teacher.lesson_3_oop_first_look.lessoncode;

public class BankCardDemo {

    public static void main(String[] args) {
        BankCard alexCard = new BankCard("Swed", "Aleksandrs Ivanovs", 1111);

        System.out.println(alexCard.getBankName());

        alexCard.setBankName("Citadele");

        System.out.println(alexCard.getBankName());
    }
}
