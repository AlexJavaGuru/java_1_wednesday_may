package lv.javaguru.student_vladislav_kulikov.lesson_15.task_10_to_13;

class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    @Override
    public String score() {
        String score;
        if (m_score1 == m_score2) {
            score = scoreIsEquals();
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            score = scoreIsMoreThanFour();
        } else {
           score = tennisGame();
        }
        return score;
    }

    private String scoreIsEquals() {
        return switch (m_score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private String scoreIsMoreThanFour() {
        String score;

        int minusResult = m_score1 - m_score2;

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

    private String tennisGame() {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = m_score1;
            } else {
                scoreBuilder.append("-");
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0 -> scoreBuilder.append("Love");
                case 1 -> scoreBuilder.append("Fifteen");
                case 2 -> scoreBuilder.append("Thirty");
                case 3 -> scoreBuilder.append("Forty");
            }
        }
        return scoreBuilder.toString();
    }
}