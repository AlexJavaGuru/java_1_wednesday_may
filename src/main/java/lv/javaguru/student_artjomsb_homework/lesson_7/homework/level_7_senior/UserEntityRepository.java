package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

import java.util.Arrays;

class UserEntityRepository {
    private int id = 0;
    private UserEntity[] allUsers = new UserEntity[1];

    void saveUser(UserEntity newUser) {
        if (isPersonalIdUnique(newUser.getPersonalId())) {
            findFreeID();
            newUser.setId(id);
            allUsers[id] = newUser;
        } else {
            System.out.println("Error, user with the same personal-id registered");
        }
    }

    private void findFreeID() {
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] == null) {
                id = i;
                break;
            }
        }
        if (allUsers[id] != null) {
            allUsers = Arrays.copyOf(allUsers, allUsers.length + 1);
            id = allUsers.length - 1;
        }
    }

    void editUser(String dataToChange, int id, int optionToChange) {
        if (getUserWithId(id) != null) {
            editDataInUser(optionToChange, dataToChange,id);
        } else {
            System.out.println("User not found!");
        }
    }

    void editDataInUser(int optionToChange, String dataToChange,int id) {
        switch (optionToChange) {
            case 1:
                allUsers[id].setUserName(dataToChange);
                break;
            case 2:
                allUsers[id].setSurname(dataToChange);
                break;
            case 3:
                if (isPersonalIdUnique(dataToChange)) {
                    allUsers[id].setPersonalId(dataToChange);
                } else {
                    System.out.println("Error,User with this Personal ID exist");
                }
                break;
        }
    }

    UserEntity getUserByName(String name) {
        for (UserEntity allUser : allUsers) {
            if (allUser != null && name.equals(allUser.getUserName())) {
                return allUser;
            }
        }
        return null;
    }

    boolean isPersonalIdUnique(String personalId) {
        for (UserEntity allUser : allUsers) {
            if (allUser != null && personalId.equals(allUser.getPersonalId())) {
                return false;
            }
        }
        return true;
    }

    void deleteUser(String personalId) {
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null && allUsers[i].getPersonalId().equals(personalId)) {
                allUsers[i] = null;
                break;
            }
        }
    }

    UserEntity getUserWithId(int id) {
        return allUsers[id];
    }

    UserEntity[] getAllUsers() {
        return allUsers;
    }
}
