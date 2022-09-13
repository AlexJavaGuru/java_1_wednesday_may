package lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

class BankAccountTwoDemo {
    public static void main(String[] args) {
        BankAccountTwo bankAccount = new BankAccountTwo("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
