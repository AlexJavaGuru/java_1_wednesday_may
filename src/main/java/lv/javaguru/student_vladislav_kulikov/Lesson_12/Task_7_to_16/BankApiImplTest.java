package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_7_to_16;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        testFindByUid();
    }

    static void testFindByUid() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST Find by ID = FAIL");
        }catch(AccessDeniedException e) {
            System.out.println("TEST Find by ID = OK");
        }
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
