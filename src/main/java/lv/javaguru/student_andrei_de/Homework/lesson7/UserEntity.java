package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;


class UserEntity {

    int id;
    String name;
    String surname;
    String personalCode;


    UserEntity(String name, String surname, String personalCode) {
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalId='" + personalCode + '\'' +
                '}';

    }
}
