package lv.javaguru.student_vladislav_kulikov.lesson_14.task_18_to_38;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    private List<Transaction> transactions;

    public TransactionAnalysisService(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    List<Transaction> getTransactions() {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(toList());
    }

    List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(toList());
    }

    List<Transaction> sortTransactionsAscending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    List<Transaction> sortTransactionsDescending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(toList());
    }

    List<Transaction> sortTransactionsAscendingByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    List<Integer> findAllYears(List<Transaction> transactions) {
        return transactions.stream()
                .collect(ArrayList::new,
                        (integers, transaction) -> integers.add(transaction.getYear()),
                        (ArrayList::addAll));
    }

    Set<Integer> findAllUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .collect(HashSet::new,
                        ((integers, transaction) -> integers.add(transaction.getYear())),
                        (Set::addAll));
    }

    Set<String> findAllUniqueNames(List<Transaction> transactions) {
        return transactions.stream()
                .collect(HashSet::new,
                        ((string, transaction) -> string.add(transaction.getTrader().getName())),
                        (Set::addAll));
    }


    Set<String> findAllUniqueCity(List<Transaction> transactions) {
        return transactions.stream()
                .collect(HashSet::new,
                        ((string, transaction) -> string.add(transaction.getTrader().getCity())),
                        (Set::addAll));
    }

    List<String> findAllTradersNameFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(cityToFind))
                .map(transaction -> transaction.getTrader().getName())
                .collect(toList());
    }

    boolean isCityHaveATrader(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals(cityToFind));
    }

    Optional<Integer> findBiggestValueFromTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);
    }

    Optional<Integer> findSmallestValueFromTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compareTo);
    }

    String sortTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(","));
    }

    String uniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }
}
