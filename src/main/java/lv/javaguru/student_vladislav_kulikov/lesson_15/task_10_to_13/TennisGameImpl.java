package lv.javaguru.student_vladislav_kulikov.lesson_15.task_10_to_13;

class TennisGameImpl implements TennisGame {


    private int score1 = 0;
    private int score2 = 0;
    private String player1;
    private String player2;

    public TennisGameImpl(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            score1 += 1;
        } else if (playerName.equals("player2")) {
            score2 += 1;
        }
    }

    @Override
    public String score() {
        StringBuilder score;

        if (score1 == score2) {
            score = new StringBuilder(scoreAreEquals(score1));
        } else if (score1 >= 4 || score2 >= 4) {
            score = new StringBuilder(scoreAreFourOrMoreThanFour());
        } else {
            score = new StringBuilder(gameOfTennis());
        }
        return score.toString();
    }

    private String scoreAreEquals(int m_score1) {
        return switch (m_score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private String scoreAreFourOrMoreThanFour() {
        String score;
        int minusResult = score1 - score2;

        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private String gameOfTennis() {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            } else {
                score.append("-");
                tempScore = score2;
            }
            switch (tempScore) {
                case 0 -> score.append("Love");
                case 1 -> score.append("Fifteen");
                case 2 -> score.append("Thirty");
                case 3 -> score.append("Forty");
            }
        }
        return score.toString();
    }
}
