package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    ConstructorChaining(String constructorName, int parameterCount) {
        ConstructorChaining chaining = new ConstructorChaining(constructorName);
        this.parameterCount = parameterCount;
    }

}
