package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyListImpl implements MyList {

    @Override
    public void sortMinMax(List<Integer> array) {
        Collections.sort(array);
    }

    @Override
    public void sortMaxMin(List<Integer> array) {
        array.sort(Collections.reverseOrder());
    }

    @Override
    public int getArraySize(List<Integer> array) {
        return array.size();
    }

    @Override
    public void deleteNumberByID(List<Integer> array, int id) {
        array.remove(id);
    }

    @Override
    public void deleteNumber(List<Integer> array, int number) {
        array.remove(Integer.valueOf(number));
    }

    @Override
    public int findMostFrequentNumber(List<Integer> array) {
        int[] numberCountArray = createMassiveWhichReplaceNumbersWithItAmount(array);
        return array.get(findPositionOfBiggestNumber(numberCountArray));
    }

    private int[] createMassiveWhichReplaceNumbersWithItAmount(List<Integer> array) {
        int numberCounter = 0;
        int[] numberCountArray = new int[array.size()];
        for (int numberCount = 0; numberCount < array.size(); numberCount++) {
            for (Integer s : array) {
                if (array.get(numberCount).equals(s)) {
                    numberCounter++;
                }
            }
            numberCountArray[numberCount] = numberCounter;
            numberCounter = 0;
        }
        return numberCountArray;
    }

    private int findPositionOfBiggestNumber(int[] numberCountArray) {
        int max = 0;
        for (int count = 0; count < numberCountArray.length; count++) {
            if (numberCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }

    @Override
    public void addNumber(List<Integer> array, int number) {
        array.add(number);
    }

    @Override
    public void increaseArraySize(ArrayList<Integer> array, int plusSize) {
        array.ensureCapacity(array.size() + plusSize);

        //Для этого тест никак не написать я так понял. ArrayList увеличивать в размере есть смысл только для меньшей нагрузки на пямать?
        // Например если мы знаем что у нас будет операция по добавлению сотен обьектов в лист и мы заранее прописываем обьём
        //Вообще наверное это бессмысленный метод и я так понимаю в разработке он не применяется :D
    }
}