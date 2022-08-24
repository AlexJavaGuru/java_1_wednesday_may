package main.java.lv.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.net.http.HttpTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankService {

    private List<User> users = new ArrayList<>();
    private String token = "1234ABC";

    public BankService() {
        users.add(new User("Alex", "1234"));
        users.add(new User("Viktor", "4321"));
        users.add(new User("Irina", "1111"));
    }

    public Optional<User> searchUserByUserName(String userName, String inputToken) throws HttpTimeoutException{
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
