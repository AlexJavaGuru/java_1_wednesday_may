package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_29;


public abstract class Computer implements GamePlayable {

    private ComputerParameters parameters;

    Computer(ComputerParameters parameters){
        this.parameters = parameters;
    }

    private boolean canPlayThisGame(Game game) {

        return game.getRequirements().contains(this.parameters);
    }

    @Override
    public void playGame(Game game) {

        if(this.canPlayThisGame(game)) {
            if(this instanceof DesktopComputer) {
                System.out.println("Sorry but playing without monitor, mouse and keyboard will be difficult :) !");
            }else{
                game.startToPlay();
            }
        }else{
            System.out.println("Your computer is too weak");
        }

    }

    void showParameters() {
        System.out.println(this.parameters);
    }
}
