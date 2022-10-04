package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_7;

import java.util.Arrays;

public class UserEntityDemo {

    public static void main(String[] args) {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity Freddie = new UserEntity("Freddie","Mercury","0002");
        UserEntity Brian = new UserEntity("Brian","May","0003");
        UserEntity John = new UserEntity("John","Deacon","0004");
        test.addUser(Freddie);
        test.addUser(Brian);
        test.addUser(John);
        System.out.println(Arrays.toString(test.getAllUsers()));
        System.out.println(test.getUserById(2));
        test.editUser(2,1,"Johnny");
        System.out.println(Arrays.toString(test.getAllUsers()));
        System.out.println(Arrays.toString(test.getUserByName("Brian")));
        test.deleteUser("0002");
        System.out.println(Arrays.toString(test.getAllUsers()));
        UserEntity Roger = new UserEntity("Roger","Taylor","0005");
        test.addUser(Roger);
        System.out.println(Arrays.toString(test.getAllUsers()));
    }
}
