package lv.javaguru.teacher.lesson_12_exceptions.lessoncode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.http.HttpTimeoutException;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    BankService subject;

    @BeforeEach
    void setUp() {
        subject = new BankService();
    }

    @Test
    void testMustThrowAnException() {
        assertThrows(HttpTimeoutException.class, () -> subject.searchUserByUserName("Random", "1111"));
    }
}