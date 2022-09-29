package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    public static void main(String[] args) {
        findByUidTest();
        findByUidTestShouldThrowExceptionTest();
    }

    private static void findByUidTestShouldThrowExceptionTest() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("findByUidTestShouldThrowExceptionTest FAIL");
        } catch(AccessDeniedException e) {
            System.out.println("findByUidTestShouldThrowExceptionTest OK");
        }
    }

    private static void findByUidTest() {
        List<BankClient> bankClients = new ArrayList<>();
        bankClients.add(new BankClient("1", "Vasja Pupkin"));
        bankClients.add(new BankClient("2", "Kolja Ribkin"));
        BankApi bankApi = new BankApiImpl(bankClients);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            Optional<BankClient> bankClientOpt = bankApi.findByUid(userCredentials, "2");
            check(bankClientOpt.get().getFullName().equals("Kolja Ribkin"), "findByUidTest");
        }catch(AccessDeniedException e){
            System.out.println("Err: " + e.getMessage());
        }

    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
