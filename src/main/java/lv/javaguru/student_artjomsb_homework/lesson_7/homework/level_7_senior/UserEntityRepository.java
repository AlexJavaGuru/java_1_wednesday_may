package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

import java.util.Arrays;

class UserEntityRepository {
    private int id = 0;

    private UserEntity[] allUsers = new UserEntity[1];

    void saveUser(UserEntity newUser) {
        if (isPersonalIdUnique(newUser)) {
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

    UserEntity getUserByName(String name) {
        for (UserEntity allUser : allUsers) {
            if (allUser != null && name.equals(allUser.getUserName())) {
                return allUser;
            }
        }
        return null;
    }


    boolean isPersonalIdUnique(UserEntity user) {
        String userId = user.getPersonalId();
        for (UserEntity allUser : allUsers) {
            if (allUser != null && userId.equals(allUser.getPersonalId())) {
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
