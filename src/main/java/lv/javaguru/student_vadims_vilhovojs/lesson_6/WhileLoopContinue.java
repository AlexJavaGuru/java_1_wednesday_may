package lv.javaguru.student_vadims_vilhovojs.lesson_6;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i =0;
        while (i<20){
            if (i%2==0){
                i++;
                continue;
            }
            System.out.println("i="+i+";");
             i++;
        }
    }
}
