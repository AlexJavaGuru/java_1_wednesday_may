package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_2;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    // создайте конструктор класса, в котором вы получаете список ролей

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }

    // создайте get() метод для свойства
}
