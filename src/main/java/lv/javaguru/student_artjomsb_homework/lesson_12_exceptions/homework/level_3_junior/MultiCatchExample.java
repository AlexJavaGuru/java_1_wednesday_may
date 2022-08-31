package lv.javaguru.student_artjomsb_homework.lesson_12_exceptions.homework.level_3_junior;

class MultiCatchExample {
    //    public static void main(String[] args) {
//        try {
//            int a = 5 / 0;
//        } catch (Exception e) {
//            System.out.println("Error????");              //compile error
//        } catch (ArithmeticException a) {
//            System.out.println("Still we can't divide on zero");
//        }
//    }
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException a) {
            System.out.println("Still we can't divide on zero");
        } catch (Exception e) {
            System.out.println("Error????");
        }
    }
}
