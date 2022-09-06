package lv.javaguru.student_vladislav_kulikov.lesson_14.task_18_to_38;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService analysisService;
    List<Transaction> transactions = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader brian2 = new Trader("Brian", "London");
        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(brian2, 2012, 300),
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
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertEquals(expectedResult, analysisService.getTransactions());
    }

    @Test
    void testGetTransactionsOf2011() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertEquals(expectedResult, analysisService.findTransactionsByYear(transactions, 2011));
    }

    @Test
    void testGetTransactionsOf2012() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "London");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2012, 300),
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
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader brian2 = new Trader("Brian", "London");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(brian2, 2012, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        assertThat(analysisService.sortTransactionsAscending(transactions)).isEqualTo(expectedResult);
    }

    @Test
    void testSortTransactionsDescending() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader brian2 = new Trader("Brian", "London");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300),
                new Transaction(brian2, 2012, 300)
        );

        assertThat(analysisService.sortTransactionsDescending(transactions)).isEqualTo(expectedResult);
    }

    @Test
    void testSortTransactionsAscendingByYear() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        assertThat(analysisService.sortTransactionsAscendingByYear(transactions, 2011))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindAllYears() {
        List<Integer> expectedResult = Arrays.asList(2011, 2012, 2012, 2011, 2012, 2012, 2012);
        assertThat(analysisService.findAllYears(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindUniqueYears() {
        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(2011);
        expectedResult.add(2012);
        assertThat(analysisService.findAllUniqueYears(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindUniqueNames() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader alan2 = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader brian2 = new Trader("Brian", "Cambridge");
        List<Transaction> transactionList = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(brian2, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(alan2, 2012, 950)
        );
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Raoul");
        expectedResult.add("Mario");
        expectedResult.add("Alan");
        expectedResult.add("Brian");
        assertThat(analysisService.findAllUniqueNames(transactionList))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindUniqueCity() {
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Cambridge");
        expectedResult.add("Milan");
        expectedResult.add("London");
        assertThat(analysisService.findAllUniqueCity(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindAllTradersFromCambridge() {
        List<String> expectedResult = List.of("Brian", "Raoul", "Raoul", "Alan");
        assertThat(analysisService.findAllTradersNameFromCity(transactions, "Cambridge"))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindAllTradersFromLondon() {
        List<String> expectedResult = List.of("Brian");
        assertThat(analysisService.findAllTradersNameFromCity(transactions, "London"))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindAllTradersFromMilan() {
        List<String> expectedResult = List.of("Mario", "Mario");
        assertThat(analysisService.findAllTradersNameFromCity(transactions, "Milan"))
                .isEqualTo(expectedResult);
    }


    @Test
    void testIsCityHaveTraderCambridge() {
        assertThat(analysisService.isCityHaveATrader(transactions, "Cambridge"))
                .isEqualTo(true);
    }

    @Test
    void testIsCityHaveTraderLondon() {
        assertThat(analysisService.isCityHaveATrader(transactions, "London"))
                .isEqualTo(true);
    }

    @Test
    void testIsCityHaveTraderMilan() {
        assertThat(analysisService.isCityHaveATrader(transactions, "Milan"))
                .isEqualTo(true);
    }

    @Test
    void testFindBiggestValue() {
        Optional<Integer> expectedResult = Optional.of(1000);
        assertThat(analysisService.findBiggestValueFromTraders(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testFindSmallestValue() {
        Optional<Integer> expectedResult = Optional.of(300);
        assertThat(analysisService.findSmallestValueFromTraders(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testSortAllTraderNames() {
        String expectedResult = "Alan,Brian,Brian,Mario,Mario,Raoul,Raoul";
        assertThat(analysisService.sortTraderNames(transactions))
                .isEqualTo(expectedResult);
    }

    @Test
    void testUniqueCities() {
        String expectedResult = "Cambridge,London,Milan";
        assertThat(analysisService.uniqueCities(transactions))
                .isEqualTo(expectedResult);
    }

}