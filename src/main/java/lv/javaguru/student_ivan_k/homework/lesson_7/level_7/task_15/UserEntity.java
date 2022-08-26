package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_15;

import java.util.Objects;

class UserEntity {

    private long userId;
    private String name;

    private String lastName;
    private int personalNumber;


    public UserEntity(String name, String lastName, int personalNumber) {
        this.name = name;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
    }

    public long getId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setId(long id) {
        this.userId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId && personalNumber == that.personalNumber && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, lastName, personalNumber);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalNumber=" + personalNumber +
                '}';
    }


}
