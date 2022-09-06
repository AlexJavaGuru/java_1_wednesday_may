package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_2_intern;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws RoleRestrictionsException {
        if (!credentials.checkRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new RoleRestrictionsException("You don't have access!");
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}