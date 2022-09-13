package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_15;

class UserEntityDemo {

    public static void main(String[] args) {
        saveUserTest();
        deleteUser();
        noDeleteUser();
        findUserByName();
        noFindUserByName();
        noSaveUserTest();
        changeNameInUser();
        noChangeNameInUser();
        changeSecondNameInUser();
        noChangeSecondNameInUser();
        changePersonalCodeInUser();
        noChangePersonalCodeInUser();
    }

    static void saveUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity userTestOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(userTestOne);
        UserEntity[] result = test.getUsers();
        check(result != null, "Save User Test");
    }

    static void noSaveUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity userTestOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(userTestOne);
        test.deleteUser("1234-5678");
        check(test.getUserWithIndex(0) == null, "No Save User Test");
    }


    static void deleteUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        UserEntity[] result = test.getUsers();
        test.deleteUser("1234-5678");
        check(test.getUserWithIndex(0) == null, "Delete User");
    }

    static void noDeleteUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.deleteUser("1234-5677");
        check(test.getUserWithIndex(0) != null, "No Delete User");
    }

    static void findUserByName() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        UserEntity testUserTwo = new UserEntity("user2", "secondname2", "8765-4321");
        test.saveUser(testUserOne);
        test.saveUser(testUserTwo);
        UserEntity result = test.findUserByName("user1");
        check(result == test.findUserByName("user1"), "Find User By Name");
    }

    static void noFindUserByName() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        UserEntity testUserTwo = new UserEntity("user2", "secondname2", "8765-4321");
        test.saveUser(testUserOne);
        test.saveUser(testUserTwo);
        check(test.findUserByName("User3") == null, "No Find User By Name");
    }

    static void changeNameInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "user2", 1);
        check(testUserOne.getName().equals("user2"), "Change Name in User");
    }

    static void noChangeNameInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "user1", 1);
        check(!testUserOne.getName().equals("user2"), "No Change Name in User");
    }

    static void changeSecondNameInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "secondName2", 2);
        check(testUserOne.getSecondName().equals("secondName2"), "Change Second Name in User");
    }

    static void noChangeSecondNameInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "secondname1", 2);
        check(!testUserOne.getSecondName().equals("secondName2"), "No Change Second Name in User");
    }

    static void changePersonalCodeInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "1234-5679", 3);
        check(testUserOne.getPersonalCode().equals("1234-5679"), "Change Personal Code in User");
    }

    static void noChangePersonalCodeInUser() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity testUserOne = new UserEntity("user1", "secondname1", "1234-5678");
        test.saveUser(testUserOne);
        test.editUser(0, "1234-5678", 3);
        check(!testUserOne.getPersonalCode().equals("1234-5679"), "No Change Personal Code in User");
    }


   static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}


