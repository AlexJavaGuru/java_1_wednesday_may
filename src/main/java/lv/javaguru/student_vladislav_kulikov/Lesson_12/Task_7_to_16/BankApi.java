package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_7_to_16;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
