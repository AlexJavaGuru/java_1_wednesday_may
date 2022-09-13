package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_29;

import java.util.HashSet;

public class Game {
    String name;
    String action;
    HashSet <ComputerParameters> requirements = new HashSet<>();

    Game(String name, String action, ComputerParameters minRequirement) {
        this.name = name;
        this.action = action;
        this.requirements.add(minRequirement);
    }

    public String getName() {
        return this.name;
    }

    void addRequirement(ComputerParameters requirement) {
        this.requirements.add(requirement);
    }

    HashSet <ComputerParameters> getRequirements(){

        return this.requirements;
    }

    void startToPlay() {

        System.out.println(action);
    }
}
