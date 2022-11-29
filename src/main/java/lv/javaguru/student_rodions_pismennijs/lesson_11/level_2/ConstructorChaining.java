package lv.javaguru.student_rodions_pismennijs.lesson_11.level_2;

public class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут

    public ConstructorChaining(ConstructorChaining constructorChaining, int parameterCount) {
        this.parameterCount = parameterCount;
    }
}
