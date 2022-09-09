package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_3_junior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    private TransactionAnalysisService transactionAnalysisService;
    private final TransactionTestData transactionTestData = new TransactionTestData();
    private List<Transaction> expected;
    private List<Transaction> actual;
    private List<Transaction> transactionList;

    @BeforeEach
    void setUp() {
        transactionAnalysisService = new TransactionAnalysisService();
        expected = new ArrayList<>();
        actual = new ArrayList<>();
        transactionList = transactionTestData.getTransactions();
    }

    @Test
    void testTransactionsIn2011() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        actual = transactionAnalysisService.transactionsByYear(transactionList, 2011);
        assertEquals(expected, actual);
    }

    @Test
    void testVoidTransaction() {
        actual = transactionAnalysisService.transactionsByYear(transactionList, 2007);
        assertEquals(expected, actual);
    }

    @Test
    void testVarArgsTransactionMethod() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        actual = transactionAnalysisService.transactionsByYear(transactionList, 2011, 2012, 42);
        assertEquals(expected, actual);
    }

    @Test
    void testSortedByValueMinMax() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        actual = transactionAnalysisService.sortByValue(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testSortedByValueMaxMin() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        actual = transactionAnalysisService.sortByValueReverse(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testAllYearsOfTransactions() {
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> actual = transactionAnalysisService.findYearOfTransactions(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testAllUniqueYearsOfTransactions() {
        Set<Integer> expected = new HashSet<>();
        expected.add(2011);
        expected.add(2012);
        Set<Integer> actual = transactionAnalysisService.findUniqueYearOfTransactions(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueNamesOfTraders() {
        Set<String> expected = new HashSet<>();
        expected.add("Raoul");
        expected.add("Mario");
        expected.add("Alan");
        expected.add("Brian");
        Set<String> actual = transactionAnalysisService.findUniqueTradersNameOfTransactions(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueCitiesOfTraders() {
        Set<String> expected = new HashSet<>();
        expected.add("Milan");
        expected.add("Cambridge");
        Set<String> actual = transactionAnalysisService.findUniqueCitiesOfTransactions(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testFindNamesFromCambridge() {
        List<String> expected = Arrays.asList("Brian", "Raoul", "Raoul", "Alan");
        List<String> actual = transactionAnalysisService.findNamesFromCambridge(transactionList, "Cambridge");
        assertEquals(expected, actual);
    }

    @Test
    void testFindNamesFromMilan() {
        List<String> expected = Arrays.asList("Mario", "Mario");
        List<String> actual = transactionAnalysisService.findNamesFromCambridge(transactionList, "Milan");
        assertEquals(expected, actual);
    }

    @Test
    void testIsAnyTradersFromCityMilan() {
        boolean actual = transactionAnalysisService.isAnyTradersFromCity(transactionList, "miLAn");
        assertTrue(actual);
    }

    @Test
    void testFindBiggestValue() {
        Optional<Integer> expected = Optional.of(1000);
        Optional<Integer> actual = transactionAnalysisService.findBiggestValue(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testFindLowestValue() {
        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = transactionAnalysisService.findLowestValue(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testSortNamesInString() {
        String expected = "Alan,Brian,Mario,Mario,Raoul,Raoul";
        String actual = transactionAnalysisService.sortedTraderNames(transactionList);
        assertEquals(expected, actual);
    }

    @Test
    void testSortCitiesInString() {
        String expected = "Cambridge,Milan";
        String actual = transactionAnalysisService.uniqueSortedTraderCities(transactionList);
        assertEquals(expected, actual);
    }
}