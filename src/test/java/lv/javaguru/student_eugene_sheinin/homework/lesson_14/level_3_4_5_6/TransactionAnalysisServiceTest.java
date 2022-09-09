package lv.javaguru.student_eugene_sheinin.homework.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService subject;
    List<Transaction> testData;

    @BeforeEach
    void setUp() {
        subject = new TransactionAnalysisService();
        testData = new TransactionTestData().getTransactions();
    }

    @Test
    void testGetTransactions2011Year() {
        assertEquals(2, subject.getTransactions2011Year(testData).size());
    }

    @Test
    void testFindTransactionsByYear() {
        assertEquals(2, subject.findTransactionsByYear(testData, 2011).size());
    }

    @Test
    void  testGetSortedTransactionsByValue() {
        List<Transaction> sortedTransactions = subject.getSortedTransactionsByValue(testData);
        assertEquals(300, sortedTransactions.get(0).getValue());
        assertEquals(700, sortedTransactions.get(2).getValue());
        assertEquals(1000, sortedTransactions.get(5).getValue());
    }

    @Test
    void getReverseSortedTransactionsByValue() {
        List<Transaction> sortedTransactions = subject.getReverseSortedTransactionsByValue(testData);
        assertEquals(1000, sortedTransactions.get(0).getValue());
        assertEquals(710, sortedTransactions.get(2).getValue());
        assertEquals(300, sortedTransactions.get(5).getValue());
    }

    @Test
    void testGetTransactionsYears() {
        int [] expectedYears = {2011,2012,2011,2012,2012,2012};
        assertArrayEquals(expectedYears, subject.getTransactionsYears(testData));
    }

    @Test
    void testGetTransactionsUniqueYears() {
        assertEquals(2, subject.getTransactionsUniqueYears(testData).size());
    }

    @Test
    void testGetTransactionsUniqueTradersName() {
        assertEquals(4, subject.getTransactionsUniqueTradersName(testData).size());
    }

    @Test
    void testGetTransactionsUniqueTradersCity() {
        assertEquals(2, subject.getTransactionsUniqueTradersCity(testData).size());
    }

    @Test
    void testGetTransactionsTradersNameFromCambridge() {
        assertEquals(3, subject.getTransactionsTradersNameFromCambridge(testData).size());
    }

    @Test
    void testFindTraderNamesFromCity() {
        assertEquals(3, subject.findTraderNamesFromCity(testData, "Cambridge").size());
        assertEquals(1, subject.findTraderNamesFromCity(testData, "Milan").size());
    }

    @Test
    void testAreAnyTradersFromMilan() {
        assertTrue(subject.areAnyTradersFromMilan(testData));
    }

    @Test
    void testAnyTradersFromCity() {
        assertTrue(subject.areAnyTradersFromCity(testData, "Cambridge"));
        assertFalse(subject.areAnyTradersFromCity(testData, "London"));
    }

    @Test
    void findMaxValueFromTransactions() {
        assertEquals(1000, subject.findMaxValueFromTransactions(testData).get());
    }

    @Test
    void findMinValueFromTransactions() {
        assertEquals(300, subject.findMinValueFromTransactions(testData).get());
    }

    @Test
    void getStringWithTradersNames() {
        assertEquals("Alan,Brian,Mario,Raoul", subject.getSortedStringWithTradersNames(testData));
    }

    @Test
    void getSortedStringWithTradersCities() {
        assertEquals("Cambridge,Milan", subject.getSortedStringWithTradersCities(testData));
    }
}