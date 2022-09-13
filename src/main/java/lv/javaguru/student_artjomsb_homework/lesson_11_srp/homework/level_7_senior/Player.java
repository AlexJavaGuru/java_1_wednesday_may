package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

import java.util.Objects;
import java.util.Scanner;

class Player {
    private String name;
    private String role;

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
    }

    int askForMove() {
        Scanner in = new Scanner(System.in);
        int columnNum;
        do {
            System.out.print("Enter column number from 1 to 7 - ");
            columnNum = in.nextInt();
        } while (!isMoveInRange(columnNum));
        return columnNum - 1;
    }

    boolean isMoveInRange(int columnNum) {
        return columnNum > 0 && columnNum < 8;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(role, player.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}
