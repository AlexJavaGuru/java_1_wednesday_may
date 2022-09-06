package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_3_junior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    private GameOfLifeNextGenerationCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    void testCellsWithLessThan2NeighborsDie() {
        boolean[][] currentGeneration = {
                {true, false, false, false, true},
                {false, false, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
                {true, false, false, false, true},
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, true, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }

    @Test
    void testCellsWithMoreThan3NeighborsDie() {
        boolean[][] currentGeneration = {
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
        };
        boolean[][] nextGeneration = {
                {true, false, false, false, true},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {true, false, false, false, true},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
    @Test
    void testDeadCellsWith3AliveNeighborsBecomeAlive() {
        boolean[][] currentGeneration = {
                {false, true, false, false, false},
                {true, true, false, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] nextGeneration = {
                {true, true, false, false, false},
                {true, true, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
    @Test
    void testCellsWith2Or3NeighborsStayAlive() {
        boolean[][] currentGeneration = {
                {false, false, false, false, true},
                {false, false, false, true, false},
                {false, false, true, false, false},
                {true, true, false, false, false},
                {true, true, false, false, false},
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, true, false},
                {false, true, true, false, false},
                {true, false, true, false, false},
                {true, true, false, false, false},
        };
        boolean[][] actual = calculator.calculate(currentGeneration);
        assertArrayEquals(nextGeneration, actual);
    }
}