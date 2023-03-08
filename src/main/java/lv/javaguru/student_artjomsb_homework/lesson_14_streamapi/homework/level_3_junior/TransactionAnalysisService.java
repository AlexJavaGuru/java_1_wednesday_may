package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_3_junior;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    List<Transaction> transactionsByYear(List<Transaction> transactions, int... year) {
        return transactions.stream()
                .filter(t -> Arrays.stream(year).anyMatch(n -> n == t.getYear()))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByValueReverse(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue)
                        .reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> find2011sortByValue(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted()
                .collect(Collectors.toList());
    }

    List<Integer> findYearOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    Set<Integer> findUniqueYearOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    Set<String> findUniqueTradersNameOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    Set<String> findUniqueCitiesOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    List<String> findNamesFromCambridge(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toList());
    }

    boolean isAnyTradersFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equalsIgnoreCase(city));
    }

    Optional<Integer> findBiggestValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder());
    }

    Optional<Integer> findLowestValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.naturalOrder());
    }

    String sortedTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                //.distinct() в задание нету про уникальные имена, но вот строчка для этого
                .sorted()
                .collect(Collectors.joining(","));
    }
    String uniqueSortedTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
