package lv.javaguru.student_vladislav_kulikov.lesson_15.task_9;

class Trader {

    private String fullName;
    private String city;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    String getFullName() {
        return fullName;
    }

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }
}
