package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_3_junior;

public class TennisGame1 implements TennisGame {

    private int firstPlayerScore = 0;
    private int secondPlayerScore = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            firstPlayerScore += 1;
        else
            secondPlayerScore += 1;
    }

    @Override
    public String score() {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (firstPlayerScore == secondPlayerScore) {
            score = getEqualScore();
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            score = getScoreMoreThree();
        } else {
            score = getScoreLessFour(score);
        }
        return score.toString();
    }

    private StringBuilder getScoreLessFour(StringBuilder score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstPlayerScore;
            else {
                score.append("-");
                tempScore = secondPlayerScore;
            }
            switch (tempScore) {
                case 0 -> score.append("Love");
                case 1 -> score.append("Fifteen");
                case 2 -> score.append("Thirty");
                case 3 -> score.append("Forty");
            }
        }
        return score;
    }

    private StringBuilder getScoreMoreThree() {
        StringBuilder score;
        int minusResult = firstPlayerScore - secondPlayerScore;
        if (minusResult == 1) score = new StringBuilder("Advantage player1");
        else if (minusResult == -1) score = new StringBuilder("Advantage player2");
        else if (minusResult >= 2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }

    private StringBuilder getEqualScore() {
        StringBuilder score;
        score = new StringBuilder(switch (firstPlayerScore) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        });
        return score;
    }
}