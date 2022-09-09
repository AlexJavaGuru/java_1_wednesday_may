package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_3_junior;

public class TennisGame3 implements TennisGame {

    private int playerOnePoint;
    private int playerTwoPoints;
    private String playerOneName;
    private String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.playerTwoPoints += 1;
        else
            this.playerOnePoint += 1;

    }

    @Override
    public String score() {
        String score;
        if (playerTwoPoints < 4 && playerOnePoint < 4 && !(playerTwoPoints + playerOnePoint == 6)) {
            String[] points = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = points[playerTwoPoints];
            return (playerTwoPoints == playerOnePoint) ? score + "-All" : score + "-" + points[playerOnePoint];
        } else {
            if (playerTwoPoints == playerOnePoint)
                return "Deuce";
            score = playerTwoPoints > playerOnePoint ? playerOneName : playerTwoName;
            return ((playerTwoPoints - playerOnePoint) * (playerTwoPoints - playerOnePoint) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

}