package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_4_junior;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}