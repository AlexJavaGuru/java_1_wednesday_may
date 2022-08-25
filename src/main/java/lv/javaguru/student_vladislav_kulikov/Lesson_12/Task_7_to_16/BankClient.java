package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_7_to_16;

class BankClient {

    private String uid;
    private String fullName;

    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "uid='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
