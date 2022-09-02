package lv.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.net.http.HttpTimeoutException;
import java.util.Optional;

public class BookServiceConsumer {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        Optional<User> response = Optional.empty();
        try {
            String result = bankService.searchUserByUserName("Alex", "1234ABC")
                    .map(User::getPassword)
                    .orElseThrow(IllegalStateException::new);
        } catch (IllegalStateException | IllegalArgumentException | HttpTimeoutException e) {
            System.out.println("Exception type: " + e.getClass());
            System.out.println("Message: " + e.getMessage());
//            throw new IllegalStateException(e);
        } finally {
            System.out.println("Hello from finally");
        }
    }
}
