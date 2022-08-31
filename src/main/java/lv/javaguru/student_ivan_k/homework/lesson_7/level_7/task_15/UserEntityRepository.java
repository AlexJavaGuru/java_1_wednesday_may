package lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_15;

import java.util.ArrayList;
import java.util.List;

class UserEntityRepository {


    List<UserEntity> allUsers = new ArrayList<>();
    long id = 0L;


    public void saveUser(UserEntity newUser) {
        allUsers.add(newUser);
        newUser.setId(id + 1L);
        id = newUser.getId();


    }

    public UserEntity getUserFromId(int serchId) {

        System.out.println(allUsers.get(serchId - 1));


        return null;
    }

    public UserEntity getAllUsers() {
        for (UserEntity allSearchUsers : allUsers) {
            System.out.println(allSearchUsers.toString());
        }
        return null;
    }

    public List<UserEntity> getUsersByName(String name) {
        List<UserEntity> sameNameUsers = new ArrayList<>();
        for (UserEntity user : allUsers) {
            if (user.getName().equals(name)) {
                sameNameUsers.add(user);
            }
        }
        return sameNameUsers;
    }

    public void deleteUser(long userId) {
        UserEntity userToRemove = null;
        for (UserEntity user : allUsers) {
            if (user.getId() == userId) {
                userToRemove = user;
            }
        }
        allUsers.remove(userToRemove);
    }

    public void editeUser(long userId, String newName, String newLastName, int newPersonalNumber) {
        for (UserEntity userToEdite : allUsers) {
            if (userToEdite.getId() == userId) {
                userToEdite.setName(newName);
                userToEdite.setLastName(newLastName);
                userToEdite.setPersonalNumber(newPersonalNumber);
                System.out.println("Changes successfully made");
            }
        }
    }
}
