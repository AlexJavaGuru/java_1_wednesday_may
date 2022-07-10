package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Scanner;

class Player {
    private int x;
    private int y;




    private String ticTacToeRole;

    Player(int x, int y, String ticTacToeRole) {
        this.x = x;
        this.y = y;
        this.ticTacToeRole = ticTacToeRole;
    }
void chooseRole(){
    Scanner inputRole = new Scanner(System.in);
    System.out.print("Please choose \"X\" or \"0\": ");
    this.ticTacToeRole = inputRole.next();
}
    void getNextMove() {
        Scanner inputMove = new Scanner(System.in);
        System.out.print("Please input coordinate X: ");
        this.x = inputMove.nextInt();
        System.out.print("Please input coordinate Y: ");
        this.y = inputMove.nextInt();

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String getTicTacToeRole() {
        return ticTacToeRole;
    }
    void setTicTacToeRole(String ticTacToeRole) {
        this.ticTacToeRole = ticTacToeRole;
    }
}
