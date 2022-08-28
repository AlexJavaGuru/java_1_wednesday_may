package lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;


class DayOfWeek {
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String dayOfWeek(int dayOfWeekNumber) {
        String result;
        switch (dayOfWeekNumber) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Wrong number!";
        }
        return result;
    }

    String dayOfWeekTwo(int numOfDay) {
        String result;
        if (numOfDay > 0 && numOfDay < 8) {
            result = days[numOfDay - 1];
        } else {
            result = "Wrong number!";
        }
        return result;
    }
}
