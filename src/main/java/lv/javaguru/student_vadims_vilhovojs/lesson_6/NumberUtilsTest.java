package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEven();
    }
    public void isEven(){
        NumberUtils numberUtils = new NumberUtils();
        int number = 8;
        boolean expectedResult = true;
        boolean actualResult = numberUtils.isEven(number);
        if (actualResult == true) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

            }
        }


    }

