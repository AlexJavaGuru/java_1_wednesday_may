package lv.javaguru.student_vladislav_kulikov.lesson_14.task_18_to_24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    private List<Transaction> transactions = new ArrayList<>();

    public TransactionAnalysisService(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    List<Transaction> getTransactions() {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsAscending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsDescending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsAscendingByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
