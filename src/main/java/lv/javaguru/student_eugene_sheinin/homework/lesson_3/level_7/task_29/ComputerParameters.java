package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_29;

//fixed custom parameters..
public enum ComputerParameters {
    BUDGET("Processor:i3 Memory:4GB Storage:120GB Graphics:built into the processor"),
    OFFICE("Processor:i5 Memory:8GB Storage:120GB Graphics:built into the processor"),
    GAMING("Processor:i7 Memory:32GB Storage:500GB Graphics:NVIDIA GEFORCE GTX 1070 8 GB");

    public final String params;

    ComputerParameters(String params) {
        this.params = params;
    }
}
