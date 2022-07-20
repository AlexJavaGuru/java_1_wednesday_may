package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

class UserEntityRepository {
    private int id;
    private UserEntity[] allUsers;

    void saveUser(UserEntity newUser) {
        if (isPersonalIdUnique(newUser)) {
            allUsers[id] = newUser;
            id++;
        } else {
            System.out.println("Error, user with the same personal-id registered");
        }
    }

    UserEntity getUserName(String name) {
        for (int i = 0; i < allUsers.length; i++) {
            if (name.equals(allUsers[i].getUserName())) {
                return allUsers[i];
            }
        }
        return null;
    }


    boolean isPersonalIdUnique(UserEntity user) {
        int userId = user.getId();
        for (UserEntity allUser : allUsers) {
            if (userId == allUser.getId()) {
                return false;
            }
        }
        return true;
    }

    UserEntity getUserWithId(int id) {
        return allUsers[id];
    }

    UserEntity[] getAllUsers() {
        return allUsers;
    }
}
