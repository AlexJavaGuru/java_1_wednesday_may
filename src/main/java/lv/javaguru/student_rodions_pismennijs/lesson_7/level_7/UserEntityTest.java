package lv.javaguru.student_rodions_pismennijs.lesson_7.level_7;

class UserEntityTest {

    public static void main(String[] args) {
        saveUserTest();
        getUserByIdTest();
        getUsersByNameTest();
        getAllUsersTest();
        editUserTest();
        deleteUserTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static void saveUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("name", "surname", "123");
        test.saveUser(user);
        UserEntity[] result = test.getAllUsers();
        check(result != null, "Save User Test");
    }

    static void getUserByIdTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user0 = new UserEntity("name0", "surname0", "123");
        UserEntity user1 = new UserEntity("name1", "surname1", "456");
        test.saveUser(user0);
        test.saveUser(user1);
        check(test.getUserById(1) != null, "Get User By Id Test");
    }

    static void getUsersByNameTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user0 = new UserEntity("name0", "surname0", "123");
        UserEntity user1 = new UserEntity("name1", "surname1", "456");
        UserEntity user2 = new UserEntity("name1", "surname2", "789");
        UserEntity user3 = new UserEntity("name1", "surname3", "012");
        test.saveUser(user0);
        test.saveUser(user1);
        test.saveUser(user2);
        test.saveUser(user3);
        check(test.getUsersByName("name1") != null, "Get Users By Name Test");
    }

    static void getAllUsersTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user0 = new UserEntity("name0", "surname0", "123");
        UserEntity user1 = new UserEntity("name1", "surname1", "456");
        UserEntity user2 = new UserEntity("name2", "surname2", "789");
        UserEntity user3 = new UserEntity("name3", "surname3", "012");
        test.saveUser(user0);
        test.saveUser(user1);
        test.saveUser(user2);
        test.saveUser(user3);
        check(test.getAllUsers() != null, "Get All Users Test");
    }

    static void editUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("name", "surname", "123");
        test.saveUser(user);
        test.editUser(0, 1, "newName");
        check(user.getName().equals("newName"), "Edit User Test");
    }

    static void deleteUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("name", "surname", "123");
        test.saveUser(user);
        test.deleteUser("123");
        check(test.getUserById(0) == null, "Delete User");
    }
}
