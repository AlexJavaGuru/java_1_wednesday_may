package lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

class Bottle {

    boolean isClosed;
    boolean isFull;

    public Bottle(boolean isClosed, boolean isFull){
        this.isClosed = isClosed;
        this.isFull = isFull;
    }

    void status(){
        System.out.println("The bottle is closed = " + this.isClosed + " , and is full = " + this.isFull);
    }

    void open(){
        isClosed = false;
        System.out.println("I opened the bottle");
    }

    void drink(){
        isFull = false;
        System.out.println("I drank all the water");
    }

    void refill(){
        isFull = true;
        System.out.println("I refilled the bottle");
    }

    void close(){
        isClosed = true;
        System.out.println("I closed the bottle");
    }


}
