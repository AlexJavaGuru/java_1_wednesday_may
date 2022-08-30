package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.lessoncode;

import lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User;

import java.net.http.HttpTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankService {

    private List<lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User> users = new ArrayList<>();
    private String token = "1234ABC";

    public BankService() {
        users.add(new lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User("Alex", "1234"));
        users.add(new lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User("Viktor", "4321"));
        users.add(new lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User("Irina", "1111"));
    }

    public Optional<lv.javaguru.teacher.lesson_12_exceptions.lessoncode.User> searchUserByUserName(String userName, String inputToken) throws HttpTimeoutException{
        if (inputToken == null) {
            throw new IllegalArgumentException("Token is NULL");
        } else if (!token.equals(inputToken)) {
            throw new HttpTimeoutException("Token is invalid");
        }

        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
