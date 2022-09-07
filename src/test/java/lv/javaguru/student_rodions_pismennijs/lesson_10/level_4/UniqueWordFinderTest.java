package lv.javaguru.student_rodions_pismennijs.lesson_10.level_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    UniqueWordFinder subject;

    @BeforeEach
    void setUp() {
        subject = new UniqueWordFinder();
    }

    @Test
    void testFind() {
        String text = "Don't bolt it extra? Better bring some extra brake some extra fluid, don't better.";
        Set<String> uniqueWords = subject.find(text);
        assertEquals(9, uniqueWords.size());
        System.out.println(uniqueWords);
    }
}