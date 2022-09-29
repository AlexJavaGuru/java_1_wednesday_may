package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_15;

import java.util.Arrays;

class UserEntityRepository {
    private UserEntity[] users = new UserEntity[1];
    private int index;

    private boolean isPersonalCodeUnique(String personalCode) {
        for (UserEntity user : users) {
            if (user != null && personalCode.equals(user.getPersonalCode())) {
                return false;
            }
        }
        return true;
    }

    private void findFreeID() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                index = i;
                break;
            }
        }
        if (users[index] != null) {
            users = Arrays.copyOf(users, users.length + 1);
            index = users.length - 1;
        }
    }

    void saveUser(UserEntity newUser) {
        if (isPersonalCodeUnique(newUser.getPersonalCode())) {
            findFreeID();
            newUser.setId(index);
            users[index] = newUser;
        }
    }

    void deleteUser(String personalCode) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getPersonalCode().equals(personalCode)) {
                users[i] = null;
            }
        }
    }

    UserEntity findUserByName(String name) {
        for (UserEntity user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    UserEntity findUserById(int index) {
        for (UserEntity user : users) {
            if (index == user.getId()) {
                return user;
            }
        }
        return null;
    }

    void editUser(int index, String change, int option) {
        if (getUserWithIndex(index) != null) {
            changeInUser(index, change, option);
        } else {
            System.out.println("Error");
        }
    }

    private void changeInUser(int index, String dataToChange, int option) {
        if (option == 1) {
            users[index].setName(dataToChange);
        } else if (option == 2) {
            users[index].setSecondName(dataToChange);
        } else if (option == 3 && isPersonalCodeUnique(dataToChange)) {
            users[index].setPersonalCode(dataToChange);
        }
    }

    UserEntity getUserWithIndex(int index) {
        return users[index];
    }

    UserEntity[] getUsers() {
        return users;
    }

}

