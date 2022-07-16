package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_29;

class Tree {
    String name;
    String color;
    int height;

    public Tree(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    void growth(int height) {
        System.out.println("Tree is growing up and now it is " + (height + 1) + " meters high");
    }
    void setHeight(int newHeight) {
        this.height = newHeight;
        System.out.println("Now birch`s height is " + height);
    }

    void color() {
        System.out.println("The tree color is " + color);
    }

    void setChangeColor(String newColor) {
        this.color = newColor;
        System.out.println("When autumn came , tree color became " + newColor);
    }
}



