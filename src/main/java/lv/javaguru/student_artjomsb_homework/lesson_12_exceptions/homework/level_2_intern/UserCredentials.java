package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    boolean checkRole(Role role) {
        return roles.contains(role);
    }
}