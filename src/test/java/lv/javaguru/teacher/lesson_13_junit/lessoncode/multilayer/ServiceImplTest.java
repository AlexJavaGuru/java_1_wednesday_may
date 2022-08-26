package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {

    ServiceImpl subject;

    DataBaseImplMock dataBaseMock;

    @BeforeEach
    void setUp() {
        System.out.println("Working before each");
        dataBaseMock = new DataBaseImplMock();
        subject = new ServiceImpl(dataBaseMock);
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Working before all");
    }

    @Test
    void testPutIntoDB() {
        int input = 10;
        subject.putIntoDB(input);
        assertTrue(dataBaseMock.wasMethodSaveWasTriggered, "Must be triggered save into the DB");
        assertEquals(input, dataBaseMock.getValueForMethodSave(),"Must be triggered with correct argument");
    }

    @Test
    void testReadFromDB() {
        String expectedResult = "Not Found";
        String actualResult = subject.readFromDB(10);
        assertTrue(dataBaseMock.isWasMethodReadWasTriggered(), "Read must be triggered");
        assertEquals(expectedResult, actualResult, "Result must be - Not Found");
    }
}