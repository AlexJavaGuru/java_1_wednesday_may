package lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class ServiceImplTestV2 {

    @Mock
    DataBase dataBaseMock;

    @InjectMocks
    ServiceImpl subject;

    @BeforeEach
    void setUp() {
        System.out.println("Working before each");
        dataBaseMock = new DataBaseImplMock();
        subject = new ServiceImpl(dataBaseMock);
    }

    @Test
    void testPutIntoDB() {
        int input = 10;
        subject.putIntoDB(input);
        verify(dataBaseMock, times(1)).save(anyInt());
    }

    @Test
    void testReadFromDB() {
//        when(dataBaseMock.read(10)).thenReturn(Optional.of(10));
//        String expectedResult = "10";
//        String actualResult = subject.readFromDB(10);
//        assertEquals(expectedResult, actualResult, "Result must be - 10");
    }
}