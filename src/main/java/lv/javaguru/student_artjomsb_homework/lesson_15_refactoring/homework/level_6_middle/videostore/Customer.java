package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_6_middle.videostore;

// This file is the original program.  It has been left here, so you can compare it with the refactored version.

import java.util.Vector;
import java.util.Enumeration;

class Customer {

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // determines the amount for each line
            thisAmount = getThisAmount(thisAmount, each);

            frequentRenterPoints++;

            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, each);

            result = printResult(result, thisAmount, each);
            totalAmount += thisAmount;

        }

        result += "You owed " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points\n";


        return result;
    }

    private String printResult(String result, double thisAmount, Rental each) {
        result += "\t" + each.getMovie().getTitle() + "\t"
                + thisAmount + "\n";
        return result;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE
                && each.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private double getThisAmount(double thisAmount, Rental each) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
            }
            case Movie.NEW_RELEASE -> thisAmount += each.getDaysRented() * 3;
            case Movie.CHILDRENS -> {
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
            }
        }
        return thisAmount;
    }


    private String name;
    private Vector rentals = new Vector();
}