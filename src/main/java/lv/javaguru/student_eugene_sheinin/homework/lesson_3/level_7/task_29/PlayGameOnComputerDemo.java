package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PlayGameOnComputerDemo {

    public static void main(String[] args) {

        //2 real world objects (Computer and Game) in lesson 29

        List<Computer> computers = new ArrayList<>();

        computers.add(new Notebook(ComputerParameters.OFFICE));
        computers.add(new Notebook(ComputerParameters.GAMING));
        computers.add(new Notebook(ComputerParameters.BUDGET));
        computers.add(new DesktopComputer(ComputerParameters.GAMING));

        List<Game> games = new ArrayList<>();
        games.add(new Game("Doom Eternal", "Kill all monsters!", ComputerParameters.GAMING));

        Game gameTmp = new Game(
                "Darkest Dungeon", "Get into the dungeon and kill all monsters :)) !",
                ComputerParameters.OFFICE
        );
        gameTmp.addRequirement(ComputerParameters.GAMING);
        games.add(gameTmp);

        //iterate through List collection different ways: with for enchanted loop and with iterator - for experiment
        for (Game game : games) {
            Iterator<Computer> iterator = computers.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                System.out.println("Playing game " + game.getName() + "  on " + (++i) + " computer");
                iterator.next().playGame(game);
            }
            System.out.println("------------------------");
        }
    }
}
