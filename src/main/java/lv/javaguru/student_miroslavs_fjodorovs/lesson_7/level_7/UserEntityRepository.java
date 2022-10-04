package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_7;

import java.util.Arrays;

class UserEntityRepository {

    private UserEntity[] users = new UserEntity[1];

    public void addUser(UserEntity user) {
        if (isPersonalCodeUnique(user.getPersonalCode())) {
            createNewUserId(user);
            users[user.getId()] = user;
        } else {
            System.out.println("Personal Code already exists");
        }
    }

    private boolean isPersonalCodeUnique(String personalCode) {
        for (UserEntity user : users) {
            if (user != null && personalCode.equals(user.getPersonalCode())) {
                return false;
            }
        }
        return true;
    }

    private void createNewUserId(UserEntity user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                user.setId(i);
                break;
            }
        }
        if (users[user.getId()] != null) {
            users = Arrays.copyOf(users, users.length + 1);
            user.setId(users.length - 1);
        }
    }

    public UserEntity getUserById(int id) {
        return users[id];
    }

    public UserEntity[] getUserByName(String name) {
        UserEntity[] newArray = new UserEntity[0];
        for (UserEntity user : users) {
            if (user != null && name.equals(user.getName())) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = user;
            }
        }
        return newArray;
    }

    public UserEntity[] getAllUsers() {
        return users;
    }

    public void editUser(int id, int option, String newData) {
        if (getUserById(id) != null) {
            makeChanges(id, option, newData);
        } else {
            System.out.println("ID doesn't exist");
        }
    }

    private void makeChanges(int id, int option, String newData) {
        switch (option) {
            case 1 -> users[id].setName(newData);
            case 2 -> users[id].setSurname(newData);
            default -> System.out.println("Error! Press 1 to change name, Press 2 to change surname");
        }
    }

    public void deleteUser(String personalCode) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getPersonalCode().equals(personalCode)) {
                users[i] = null;
            }
        }
    }
}
