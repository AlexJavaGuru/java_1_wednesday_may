package lv.javaguru.student_vadims_vilhovojs.lesson_6;

class ForLoopContinue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("i="+i+",");
        }

    }
}
