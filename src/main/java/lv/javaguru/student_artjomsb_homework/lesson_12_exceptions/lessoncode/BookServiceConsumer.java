package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.lessoncode;

import lv.javaguru.teacher.lesson_12_exceptions.lessoncode.BankService;
import lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User;

import java.net.http.HttpTimeoutException;
import java.util.Optional;

public class BookServiceConsumer {

    public static void main(String[] args) {

        lv.javaguru.teacher.lesson_12_exceptions.lessoncode.BankService bankService = new BankService();

        Optional<lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User> response = Optional.empty();
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
