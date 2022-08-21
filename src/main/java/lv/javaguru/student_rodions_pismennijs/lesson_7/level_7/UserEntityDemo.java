package main.java.lv.javaguru.student_rodions_pismennijs.lesson_7.level_7;

import java.util.Arrays;

public class UserEntityDemo {

    public static void main(String[] args) {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity asd = new UserEntity("asd","asd","154");
        UserEntity dgsd = new UserEntity("dgsd","sdg","1456");
        UserEntity asda = new UserEntity("asd","asda","155");
        test.saveUser(asd);
        test.saveUser(dgsd);
        test.saveUser(asda);
        System.out.println(Arrays.toString(test.getAllUsers()));
        System.out.println(test.getUserById(1));
        System.out.println(Arrays.toString(test.getUsersByName("asd")));
        test.editUser(2,2,"fafafaf");
        System.out.println(Arrays.toString(test.getAllUsers()));
        System.out.println(Arrays.toString(test.getUsersByName("asd")));
        test.deleteUser("1456");
        System.out.println(Arrays.toString(test.getAllUsers()));
        UserEntity dfghy = new UserEntity("dfghy","dfghy","456");
        test.saveUser(dfghy);
        System.out.println(Arrays.toString(test.getAllUsers()));
    }
}
