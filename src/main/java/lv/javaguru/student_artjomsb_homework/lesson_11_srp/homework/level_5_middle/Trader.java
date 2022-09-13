package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_5_middle;

public class Trader {
    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
