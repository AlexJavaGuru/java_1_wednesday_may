package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_1;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3();
        System.out.println("Age - " + constructorV3.getAge());
        System.out.println("Is female - " + constructorV3.isFemale());
        System.out.println("Is male - " + constructorV3.isMale());
        System.out.println("Full name - " + constructorV3.getFullName());
    }

}
