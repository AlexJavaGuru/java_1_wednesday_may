package main.java.lv.javaguru.teacher.lesson_3_oop_first_look.lessoncode;

public class BankCard {

    private String bankName;
    private String nameOnCard;
    private int securityCode;

    public BankCard(String bankName, String nameOnCard, int securityCode) {
        this.bankName = bankName;
        this.nameOnCard = nameOnCard;
        this.securityCode = securityCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
