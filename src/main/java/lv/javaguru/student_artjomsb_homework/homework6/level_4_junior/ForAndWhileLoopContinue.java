package lv.javaguru.student_artjomsb_homework.homework6.level_4_junior;

class ForAndWhileLoopContinue {
    public static void main(String[] args) {
        forLoopContinue();
        whileLoopContinue();
    }
    private static void forLoopContinue() {
        for (int i = 0; i < 10; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    private static void whileLoopContinue(){
        int i = 0;
        int myAge = 23;
        while (i != myAge + 1){
            if (i != myAge) {
                i++;
                continue;
            }
            System.out.println("My age: " + i);
            i++;
        }

    }
}
