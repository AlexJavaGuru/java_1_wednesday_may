package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_4_junior;

class StackOverflowError {
    public static void main(String[] args) {
        StackOverflowError error = new StackOverflowError();
        error.print();
    }
    void print(){
        System.out.println("Hello");
        print();
    }
}
