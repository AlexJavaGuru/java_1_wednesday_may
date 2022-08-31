package lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_15;

import java.util.Arrays;

public class UserEntityDemo {

    public static void main(String[] args) {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity num1 = new UserEntity("Alex","Ivanov",111209);
        UserEntity num2 = new UserEntity("Mixail","Serduck",101010);
        UserEntity num3 = new UserEntity("Genadiy","Vavilov",221101);
        UserEntity num4 = new UserEntity("Igor","Ivanin",130404);
        UserEntity num5 = new UserEntity("Maja","Necke",120303);
        UserEntity num6 = new UserEntity("Maja","Denke",130303);
        UserEntity num7 = new UserEntity("Maja","Mexke",140303);
        UserEntity num8 = new UserEntity("Maja","Xexe",150303);
        UserEntity num9 = new UserEntity("Alex","Xexe",160303);
        UserEntity num10 = new UserEntity("Alex","Xexe",170303);

        userEntityRepository.saveUser(num1);
        userEntityRepository.saveUser(num2);
        userEntityRepository.saveUser(num3);
        userEntityRepository.saveUser(num4);
        userEntityRepository.saveUser(num5);
        userEntityRepository.saveUser(num6);
        userEntityRepository.saveUser(num7);
        userEntityRepository.saveUser(num8);
        userEntityRepository.saveUser(num9);
        userEntityRepository.saveUser(num10);
        userEntityRepository.getUserFromId(1);
//        System.out.println(userEntityRepository.getUsersByName("Maja"));
//        userEntityRepository.getAllUsers();
        userEntityRepository.editeUser(1,"Ivan","Ivanov",111111);
        userEntityRepository.getUserFromId(1);




    }
}
