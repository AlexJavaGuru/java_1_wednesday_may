package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_7.Task_15;

import java.util.Objects;

class UserEntity {

    int id;
    String name;
    String secondName;

    String personalCode;


    UserEntity(String name, String secondName, String personalCode) {
        this.name = name;
        this.secondName = secondName;
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
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

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(secondName, that.secondName) && Objects.equals(personalCode, that.personalCode);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + name + '\'' +
                ", surname='" + secondName + '\'' +
                ", personalId='" + personalCode + '\'' +
                '}';
    }
}
