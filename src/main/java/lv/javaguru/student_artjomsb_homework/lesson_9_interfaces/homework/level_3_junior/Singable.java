package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

@FunctionalInterface //как я понял это во первых для того чтобы компилятор проверил действительно ли это функц. интерфейс и также для другого програмиста пометка)
interface Singable {
    void sing(); //только 1 абстракный метод

    String toString(); //может содержать дополнительно абстрактные методы Object

    default void whoAmI() {
        System.out.println("I'm Singer!"); // также default и static методы
    }
}
