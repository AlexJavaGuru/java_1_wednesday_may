package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_7_to_16;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.isListHaveRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Invalid Credentials");
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
