package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

class UserEntityRepositoryTest {
    public static void main(String[] args) {
        testDeleteUser();
        testUniquePersonalID();
        testNotUniquePersonalID();
        testFindUserByName();
        testNotFindUserByName();
        testChangeUserName();
        testChangeSurname();
        testChangePersonalId();
        testNotChangePersonalId();
        testFindFirstEmptyIdAndSaveUser();
        testAddUserInArray();
    }
static void testFindFirstEmptyIdAndSaveUser(){
    UserEntityRepository tester = new UserEntityRepository();
    UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
    UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78915");
    UserEntity testUserThree = new UserEntity("userThree", "surname", "123456-78912");
    UserEntity testUserFour = new UserEntity("userFour", "surname", "123456-78913");
    tester.saveUser(testUser);
    tester.saveUser(testUserTwo);
    tester.saveUser(testUserThree);
    tester.saveUser(testUserFour);
    tester.deleteUser("123456-78915");
    tester.deleteUser("123456-78913");
    tester.saveUser(testUserFour);
    UserEntity result = tester.getUserWithId(1);
    check(result.equals(testUserFour),"Test find first empty id and save user");

}
static void testAddUserInArray(){
    UserEntityRepository tester = new UserEntityRepository();
    UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
    UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78915");
    tester.saveUser(testUser);
    tester.saveUser(testUserTwo);
    check(tester.getUserWithId(0).equals(testUser) && tester.getUserWithId(1).equals(testUserTwo),"test adding users in array");
}
    static void testChangeUserName() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        tester.saveUser(testUser);
        tester.editDataInUser(1, "superUser", 0);
        check(testUser.getUserName().equals("superUser"), "Test change user name");
    }

    static void testChangeSurname() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        tester.saveUser(testUser);
        tester.editDataInUser(2, "superSurname", 0);
        check(testUser.getSurname().equals("superSurname"), "Test change user Surname");
    }

    static void testChangePersonalId() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        tester.saveUser(testUser);
        tester.editDataInUser(3, "123456-78915", 0);
        check(testUser.getPersonalId().equals("123456-78915"), "Test change user personalID");
    }

    static void testNotChangePersonalId() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78915");
        tester.saveUser(testUser);
        tester.saveUser(testUserTwo);
        tester.editDataInUser(3, "123456-78915", 0);
        check(testUser.getPersonalId().equals("123456-78910"), "Test not change user personalID");
    }

    static void testFindUserByName() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78911");
        tester.saveUser(testUser);
        tester.saveUser(testUserTwo);
        check(tester.getUserByName("userTwo").equals(testUserTwo), "Test find user by name");
    }

    static void testNotFindUserByName() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78911");
        tester.saveUser(testUser);
        tester.saveUser(testUserTwo);
        check(tester.getUserByName("userToo") == null, "Test find user by name");
    }

    static void testUniquePersonalID() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78911");
        tester.saveUser(testUser);
        check(tester.isPersonalIdUnique(testUserTwo.getPersonalId()), "Test check unique personalID");

    }

    static void testNotUniquePersonalID() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        UserEntity testUserTwo = new UserEntity("userTwo", "surname", "123456-78910");
        tester.saveUser(testUser);
        check(!tester.isPersonalIdUnique(testUserTwo.getPersonalId()), "Test check not unique personalID");

    }

    static void testDeleteUser() {
        UserEntityRepository tester = new UserEntityRepository();
        UserEntity testUser = new UserEntity("user", "surname", "123456-78910");
        tester.saveUser(testUser);
        boolean isUserCreated = tester.getUserWithId(0) != null;
        tester.deleteUser("123456-78910");
        check(tester.getUserWithId(0) == null && isUserCreated, "Test deleting user");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
