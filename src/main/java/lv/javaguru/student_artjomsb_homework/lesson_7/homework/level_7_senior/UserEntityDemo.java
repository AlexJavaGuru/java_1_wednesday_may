package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

import java.util.Arrays;

class UserEntityDemo {
    public static void main(String[] args) {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user1", "surname", "311093-59372");
        UserEntity test2User = new UserEntity("user2", "surname", "301093-59372");
        UserEntity test3User = new UserEntity("user3", "surname", "201093-59372");
        UserEntity test4User = new UserEntity("user4", "surname", "201293-59372");
        tester.saveUser(testUser);
        System.out.println(tester.getUserByName("user1"));
        tester.saveUser(test2User);
        System.out.println(tester.getUserByName("user2"));
        tester.saveUser(test3User);
        System.out.println(tester.getUserWithId(2));
        System.out.println("==================");
        tester.deleteUser("301093-59372");
        System.out.println(Arrays.toString(tester.getAllUsers()));
        System.out.println("==================");
        tester.saveUser(test4User);
        tester.saveUser(test2User);
        System.out.println(Arrays.toString(tester.getAllUsers()));
        System.out.println("==============================");
        tester.deleteUser("301093-59372");
        tester.deleteUser("311093-59372");
        tester.deleteUser("201093-59372");
        System.out.println(tester.getUserByName("user4"));
        System.out.println(Arrays.toString(tester.getAllUsers()));
        System.out.println(tester.getUserWithId(2));
        tester.saveUser(testUser);
        tester.editUser("311093-59372", 1, 3);
        System.out.println(tester.getUserWithId(1));
        System.out.println(Arrays.toString(tester.getAllUsers()));
//        tester.saveUser(test3User);
//        System.out.println(Arrays.toString(tester.getAllUsers()));
//        tester.saveUser(testUser);
//        System.out.println(Arrays.toString(tester.getAllUsers()));

    }
}
