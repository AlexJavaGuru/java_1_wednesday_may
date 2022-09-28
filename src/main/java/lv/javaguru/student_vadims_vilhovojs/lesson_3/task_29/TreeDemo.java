package lv.javaguru.student_vadims_vilhovojs.lesson_3.task_29;

class TreeDemo {
    public static void main(String[] args) {
        Tree birch = new Tree("Birch" , "Green", 4);

        birch.color();
        birch.setChangeColor("yellow");
        birch.color();
        birch.growth(birch.height);
        birch.setHeight(5);




    }

}
