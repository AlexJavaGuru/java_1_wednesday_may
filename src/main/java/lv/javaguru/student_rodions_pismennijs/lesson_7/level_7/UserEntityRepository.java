package main.java.lv.javaguru.student_rodions_pismennijs.lesson_7.level_7;

import java.util.Arrays;

class UserEntityRepository {

    private UserEntity[] userEntities = new UserEntity[1];

    public void saveUser(UserEntity user) {
        if (isPersonalCodeUnique(user.getPersonalCode())) {
            createNewUserId(user);
            userEntities[user.getId()] = user;
        } else {
            System.out.println("Personal Code already exist");
        }
    }

    private boolean isPersonalCodeUnique(String personalCode) {
        for (UserEntity user : userEntities) {
            if (user != null && personalCode.equals(user.getPersonalCode())) {
                return false;
            }
        }
        return true;
    }

    private void createNewUserId(UserEntity user) {
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] == null) {
                user.setId(i);
                break;
            }
        }
        if (userEntities[user.getId()] != null) {
            userEntities = Arrays.copyOf(userEntities, userEntities.length + 1);
            user.setId(userEntities.length - 1);
        }
    }

    public UserEntity getUserById(int id) {
        return userEntities[id];
    }

    public UserEntity[] getUsersByName(String name) {
        UserEntity[] newArray = new UserEntity[0];
        for (UserEntity user : userEntities) {
            if (user != null && name.equals(user.getName())) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = user;
            }
        }
        return newArray;
    }

    public UserEntity[] getAllUsers() {
        return userEntities;
    }

    public void editUser(int id, int option, String newData) {
        if (getUserById(id) != null) {
            makeChanges(id, option, newData);
        } else {
            System.out.println("ID not exist");
        }
    }

    private void makeChanges(int id, int option, String newData) {
        switch (option) {
            case 1 -> userEntities[id].setName(newData);
            case 2 -> userEntities[id].setSurname(newData);
            default -> System.out.println("Error. Choose 1 to change name, 2 to change surname.");
        }
    }

    public void deleteUser(String personalCode) {
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] != null && userEntities[i].getPersonalCode().equals(personalCode)) {
                userEntities[i] = null;
            }
        }
    }
}
