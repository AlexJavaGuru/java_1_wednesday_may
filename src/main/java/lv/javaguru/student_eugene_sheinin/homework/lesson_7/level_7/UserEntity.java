package lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_7;

class UserEntity {
    private int id;
    private String name;
    private String surname;
    private String personalCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalCode='" + personalCode + '\'' +
                '}';
    }
}
