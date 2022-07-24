package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

import java.util.Objects;

class UserEntity {
    private int id;
    private String userName;
    private String surname;
    private String personalId;

    public UserEntity(String userName, String surname, String personalId) {
        this.userName = userName;
        this.surname = surname;
        this.personalId = personalId;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(userName, that.userName) && Objects.equals(surname, that.surname) && Objects.equals(personalId, that.personalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, surname, personalId);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                ", personalId='" + personalId + '\'' +
                '}';
    }
}
