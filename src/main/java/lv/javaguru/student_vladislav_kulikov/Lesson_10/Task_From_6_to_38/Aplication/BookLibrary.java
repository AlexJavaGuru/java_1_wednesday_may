package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Aplication;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDataBaseImpl;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDataBaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new GetEachAuthorBookCountUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Save book: 1");
            System.out.println("--------");
            System.out.println("Find by ID book: 2");
            System.out.println("--------");
            System.out.println("Find by author book: 3");
            System.out.println("--------");
            System.out.println("Find By title book: 4");
            System.out.println("--------");
            System.out.println("Delete by ID book: 5");
            System.out.println("--------");
            System.out.println("Count all books: 6");
            System.out.println("--------");
            System.out.println("Delete book by author: 7");
            System.out.println("--------");
            System.out.println("Delete book by title: 8");
            System.out.println("--------");
            System.out.println("Find unique authors: 9");
            System.out.println("--------");
            System.out.println("Find unique titles: 10");
            System.out.println("--------");
            System.out.println("Find unique books: 11");
            System.out.println("--------");
            System.out.println("Get author to books: 12");
            System.out.println("--------");
            System.out.println("Get each author book count: 13");
            System.out.println("--------");
            System.out.println("Exit: 0");
            System.out.println("--------");
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
