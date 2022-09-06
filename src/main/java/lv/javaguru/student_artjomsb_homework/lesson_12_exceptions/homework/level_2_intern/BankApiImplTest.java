package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_2_intern;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        test.shouldNotThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch (RoleRestrictionsException e) {
            System.out.println("TEST OK");
        }

    }

    public void shouldNotThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            System.out.println(api.findByUid(credentials, "1234"));
            System.out.println("TEST OK");
        } catch (RoleRestrictionsException e) {
            System.out.println("TEST FAIL");
        }

    }

}