package lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;


class IsEven {
    private final int[] evenNumbers = {0, 2, 4, 6, 8};

    boolean evenOrNot(int number) {
        boolean isEven = false;
        String numberAsString = String.valueOf(number);
        char lastNumber = numberAsString.charAt(numberAsString.length() - 1);
        for (int evenNumber : evenNumbers) {
            if (evenNumber == Character.getNumericValue(lastNumber)) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    String evenOrNotMethodTwo(int number) {
        String result = "Odd";
        if (number % 2 == 0) result = "Even";
        return result;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
}

