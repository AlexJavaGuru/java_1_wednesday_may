package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_7;

class UserEntityTest {

    public static void main(String[] args) {
        UserEntityTest userEntityTest = new UserEntityTest();
        userEntityTest.addUserTest();
        userEntityTest.getUserByIdTest();
        userEntityTest.getUserByNameTest();
        userEntityTest.getAllUsersTest();
        userEntityTest.editUserTest();
        userEntityTest.deleteUserTest();
    }

    private static void addUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("Michael" , "Jackson", "0001");
        test.addUser(user);
        UserEntity[] result = test.getAllUsers();
        check(result != null, "Add User Test");
    }

    private static void getUserByIdTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity("Freddie", "Mercury", "0002");
        UserEntity user2 = new UserEntity("Brian", "May", "0003");
        UserEntity user3 = new UserEntity("John", "Deacon", "0004");
        UserEntity user4 = new UserEntity("Roger", "Taylor", "0005");
        test.addUser(user1);
        test.addUser(user2);
        test.addUser(user3);
        test.addUser(user4);
        check(test.getUserById(2) != null, "Get User By Id Test");
    }

    private static void getUserByNameTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity("Freddie", "Mercury", "0002");
        UserEntity user2 = new UserEntity("Brian", "May", "0003");
        UserEntity user3 = new UserEntity("John", "Deacon", "0004");
        UserEntity user4 = new UserEntity("Roger", "Taylor", "0005");
        test.addUser(user1);
        test.addUser(user2);
        test.addUser(user3);
        test.addUser(user4);
        check(test.getUserByName("John") != null, "Get User By Name Test");
    }

    private static void getAllUsersTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity("Freddie", "Mercury", "0002");
        UserEntity user2 = new UserEntity("Brian", "May", "0003");
        UserEntity user3 = new UserEntity("John", "Deacon", "0004");
        UserEntity user4 = new UserEntity("Roger", "Taylor", "0005");
        test.addUser(user1);
        test.addUser(user2);
        test.addUser(user3);
        test.addUser(user4);
        check(test.getAllUsers() != null, "Get All Users Test");
    }

    private static void editUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("Michael", "Jackson", "0001");
        test.addUser(user);
        test.editUser(0, 1, "Adam");
        check(user.getName().equals("Adam"), "Edit User Test");
    }

    private static void deleteUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user = new UserEntity("Michael", "Jackson", "0001");
        test.addUser(user);
        test.deleteUser("0001");
        check(test.getUserById(0) == null, "Delete User Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
