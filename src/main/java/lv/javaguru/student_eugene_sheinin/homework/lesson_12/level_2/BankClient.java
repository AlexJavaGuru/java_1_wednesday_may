package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_2;

class BankClient {
    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }
}
