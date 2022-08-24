package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_7;

class UserEntityRepositoryTest {

    public static void main(String[] args) {
        testAddUserToRepositoryAndGetById();
        testAddUserToRepositoryAndGetByName();
        testUpdateUser();
        testUpdateUserWithNonUniqPersonalCode();
    }

    private static void testAddUserToRepositoryAndGetById() {
        UserEntity user = new UserEntity();
        user.setName("Vasja");
        user.setSurname("Pupkin");
        user.setPersonalCode("22334-112233");

        UserEntity user2 = new UserEntity();
        user2.setName("Kolja");
        user2.setSurname("Ribkin");
        user2.setPersonalCode("22335-112233");

        UserEntityRepository userEntityRepository = new UserEntityRepository();
        userEntityRepository.addUser(user);
        userEntityRepository.addUser(user2);
        check(userEntityRepository.getUserById(2).getName().equals("Kolja"), "testAddUserToRepositoryAndGetById");
    }

    private static void testAddUserToRepositoryAndGetByName() {
        UserEntity user = new UserEntity();
        user.setName("Vasja");
        user.setSurname("Pupkin");
        user.setPersonalCode("22334-112233");

        UserEntity user2 = new UserEntity();
        user2.setName("Kolja");
        user2.setSurname("Ribkin");
        user2.setPersonalCode("22335-112233");

        UserEntityRepository userEntityRepository = new UserEntityRepository();
        userEntityRepository.addUser(user);
        userEntityRepository.addUser(user2);
        check(userEntityRepository.getUserByName("Kolja").getId() == 2, "testAddUserToRepositoryAndGetByName");
    }

    private static void testUpdateUser() {
        UserEntity user = new UserEntity();
        user.setName("Vasja");
        user.setSurname("Pupkin");
        user.setPersonalCode("22334-112233");

        UserEntity user2 = new UserEntity();
        user2.setName("Kolja");
        user2.setSurname("Ribkin");
        user2.setPersonalCode("22335-112233");

        UserEntity user3 = new UserEntity();
        user3.setName("Vitja");
        user3.setSurname("Ogurcov");
        user3.setPersonalCode("22336-112233");

        UserEntityRepository userEntityRepository = new UserEntityRepository();
        userEntityRepository.addUser(user);
        userEntityRepository.addUser(user2);
        userEntityRepository.addUser(user3);
        UserEntity userToUpdate = userEntityRepository.getUserById(3);
        userToUpdate.setName("Vasja123");
        userEntityRepository.updateUser(userToUpdate);

        check(userEntityRepository.getUserById(3).getName().equals("Vasja123"), "testUpdateUser");
    }

    private static void testUpdateUserWithNonUniqPersonalCode() {
        UserEntity user = new UserEntity();
        user.setName("Vasja");
        user.setSurname("Pupkin");
        user.setPersonalCode("22334-112233");

        UserEntity user2 = new UserEntity();
        user2.setName("Kolja");
        user2.setSurname("Ribkin");
        user2.setPersonalCode("22335-112233");

        UserEntity user3 = new UserEntity();
        user3.setName("Vitja");
        user3.setSurname("Ogurcov");
        user3.setPersonalCode("22336-112233");

        UserEntityRepository userEntityRepository = new UserEntityRepository();
        userEntityRepository.addUser(user);
        userEntityRepository.addUser(user2);
        userEntityRepository.addUser(user3);
        UserEntity userToUpdate = new UserEntity();
        userToUpdate.setId(2);
        userToUpdate.setPersonalCode("22334-112233");
        userEntityRepository.updateUser(userToUpdate);

        check(
                userEntityRepository.getUserById(2).getPersonalCode().equals("22335-112233"),
                "testUpdateUserWithNonUniqPersonalCode"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
