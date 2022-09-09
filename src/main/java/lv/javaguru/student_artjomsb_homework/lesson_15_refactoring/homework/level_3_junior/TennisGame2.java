package lv.javaguru.student_artjomsb_homework.lesson_15_refactoring.homework.level_3_junior;

import java.util.Objects;

public class TennisGame2 implements TennisGame {
    public int player1Points = 0;
    public int player2Points = 0;

    public String playerOneResult = "";
    public String playerTwoResult = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String player) {
        if (Objects.equals(player, "player1"))
            P1Score();
        else
            P2Score();
    }

    @Override
    public String score() {
        String score = "";
        if (player1Points == player2Points && player1Points < 4) {
            score = equalScore(score);
        }
        if (player1Points == player2Points && player1Points >= 3)
            score = "Deuce";

        if (player1Points > 0 && player2Points == 0) {
            score = playerTwoLove();
        }
        if (player2Points > 0 && player1Points == 0) {
            score = playerOneLove();
        }

        if (player1Points > player2Points && player1Points < 4) {
            score = playerOneBetter();
        }
        if (player2Points > player1Points && player2Points < 4) {
            score = playerTwoBetter();
        }

        if (player1Points > player2Points && player2Points >= 3) {
            score = "Advantage player1";
        }

        if (player2Points > player1Points && player1Points >= 3) {
            score = "Advantage player2";
        }

        if (player1Points >= 4 && player2Points >= 0 && (player1Points - player2Points) >= 2) {
            score = "Win for player1";
        }
        if (player2Points >= 4 && player1Points >= 0 && (player2Points - player1Points) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String playerTwoBetter() {
        String score;
        if (player2Points == 2)
            playerTwoResult = "Thirty";
        if (player2Points == 3)
            playerTwoResult = "Forty";
        if (player1Points == 1)
            playerOneResult = "Fifteen";
        if (player1Points == 2)
            playerOneResult = "Thirty";
        score = playerOneResult + "-" + playerTwoResult;
        return score;
    }

    private String playerOneBetter() {
        String score;
        if (player1Points == 2)
            playerOneResult = "Thirty";
        if (player1Points == 3)
            playerOneResult = "Forty";
        if (player2Points == 1)
            playerTwoResult = "Fifteen";
        if (player2Points == 2)
            playerTwoResult = "Thirty";
        score = playerOneResult + "-" + playerTwoResult;
        return score;
    }

    private String playerOneLove() {
        String score;
        if (player2Points == 1)
            playerTwoResult = "Fifteen";
        if (player2Points == 2)
            playerTwoResult = "Thirty";
        if (player2Points == 3)
            playerTwoResult = "Forty";

        playerOneResult = "Love";
        score = playerOneResult + "-" + playerTwoResult;
        return score;
    }

    private String playerTwoLove() {
        String score;
        if (player1Points == 1)
            playerOneResult = "Fifteen";
        if (player1Points == 2)
            playerOneResult = "Thirty";
        if (player1Points == 3)
            playerOneResult = "Forty";

        playerTwoResult = "Love";
        score = playerOneResult + "-" + playerTwoResult;
        return score;
    }

    private String equalScore(String score) {
        if (player1Points == 0)
            score = "Love";
        if (player1Points == 1)
            score = "Fifteen";
        if (player1Points == 2)
            score = "Thirty";
        score += "-All";
        return score;
    }

    public void SetP1Score(int number) {
        for (int i = 0; i < number; i++) {
            P1Score();
        }

    }

    public void SetP2Score(int number) {
        for (int i = 0; i < number; i++) {
            P2Score();
        }
    }

    public void P1Score() {
        player1Points++;
    }

    public void P2Score() {
        player2Points++;
    }
}