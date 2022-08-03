package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

class ArrayUtilsDemo {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] myArray = arrayUtils.createArray(10);
        arrayUtils.fillArrayWithRandomNumbers(myArray);

        int maxNumber = arrayUtils.findMaxNumber(myArray);
        arrayUtils.findMaxNumber(myArray);
        System.out.println(maxNumber);
    }

}
