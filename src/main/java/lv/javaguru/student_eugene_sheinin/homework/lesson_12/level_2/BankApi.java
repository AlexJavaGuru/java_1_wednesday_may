package lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_2;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
