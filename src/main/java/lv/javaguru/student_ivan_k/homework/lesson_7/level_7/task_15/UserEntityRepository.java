package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class UserEntityRepository {



    List<UserEntity> allUsers = new ArrayList<>();
    long id = 0L;


    void saveUser(UserEntity newUser){
        allUsers.add(newUser);
        newUser.setId(id + 1L);
        id = newUser.getId();


    }

    void getUserFromId(UserEntity searchId){
        for (UserEntity idUsers : allUsers) {
            if(idUsers.equals(searchId) || searchId != null){

        }
        }

    }












}
