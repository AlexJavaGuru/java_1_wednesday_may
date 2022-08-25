package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_7_to_16;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean isListHaveRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }
}
