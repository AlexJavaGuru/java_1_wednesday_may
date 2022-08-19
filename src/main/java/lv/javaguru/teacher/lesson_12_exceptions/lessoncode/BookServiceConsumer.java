package main.java.lv.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.net.http.HttpTimeoutException;
import java.util.Optional;

public class BookServiceConsumer {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        Optional<User> response = Optional.empty();
        try {
            response = bankService.searchUserByUserName("Alex", null);
        } catch (IllegalStateException | IllegalArgumentException | HttpTimeoutException e) {
            System.out.println("Exception type: " + e.getClass());
            System.out.println("Message: " + e.getMessage());
//            throw new IllegalStateException(e);
        } finally {
            System.out.println("Hello from finally");
        }

        if (response.isPresent()) {
            User user = response.get();
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }
    }
}
