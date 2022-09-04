package lv.javaguru.student_vladislav_kulikov.lesson_14.task_18_to_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
class TransactionAnalysisServiceTest {

    TransactionAnalysisService analysisService;
    List<Transaction> transactions = new ArrayList<>();
    @BeforeEach
    void setUp() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        analysisService = new TransactionAnalysisService(transactions);
    }

    @Test
    void testGetTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertEquals(expectedResult, analysisService.getTransactions());
    }

    @Test
    void testGetTransactionsOf2011() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertEquals(expectedResult, analysisService.findTransactionsByYear(transactions, 2011));
    }

    @Test
    void testGetTransactionsOf2012() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
        assertEquals(expectedResult, analysisService.findTransactionsByYear(transactions, 2012));
    }


    @Test
    void testGetTransactionsOf2013() {
        List<Transaction> expectedResult = Arrays.asList();
        assertEquals(expectedResult, analysisService.findTransactionsByYear(transactions, 2013));
    }

    @Test
    void testSortTransactionsAscending() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000));
        assertThat(analysisService.sortTransactionsAscending(transactions)).isEqualTo(expectedResult);
    }
    @Test
    void testSortTransactionsDescending() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
        assertThat(analysisService.sortTransactionsDescending(transactions)).isEqualTo(expectedResult);
    }

    @Test
    void testSortTransactionsAscendingByYear() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertThat(analysisService.sortTransactionsAscendingByYear(transactions, 2011))
                .isEqualTo(expectedResult);
    }

}