package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator subject;


    @Before
    public void setUp() {
        subject = new GameOfLifeNextGenerationCalculator();
    }


    @Test
    public void checkRulesWorkingTogether() {

        boolean[][] currentField = {
                {true, true, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        boolean[][] newField = subject.calculate(currentField);

        assertTrue(newField[1][1]);
    }

    @Test
    public void checkRulesWorkingTogetherV2() {

        boolean[][] currentField = {
                {false, false, false, false, false},
                {false, true, true, true, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        boolean[][] newField = subject.calculate(currentField);

        assertTrue(newField[2][2]);
    }



    @Test
    public void liveCellShouldDieWithLessThanTwoLiveNeighbours() {

        boolean[][] field = {
                {false, true, false, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        assertTrue(new LiveCellShouldDieWithLessThen2LiveNeighboursRule().validate(field, 1, 1));
    }

    @Test
    public void liveCellShouldDieWithMoreThan3LivesNeighbours() {

        boolean[][] field = {
                {false, true, true, false, false},
                {false, true, true, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        assertTrue(new LiveCellShouldDieWithMoreThen3LiveNeighboursRule().validate(field, 1, 1));
    }

    @Test
    public void liveCellShouldLiveWith2LivesNeighbours() {

        boolean[][] field = {
                {false, true, false, false, false},
                {false, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        assertTrue(new LiveCellShouldLiveWith2Or3LiveNeighboursRule().validate(field, 1, 1));
    }

    @Test
    public void liveCellShouldLiveWith3LivesNeighbours() {

        boolean[][] field = {
                {false, true, true, false, false},
                {false, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        assertTrue(new LiveCellShouldLiveWith2Or3LiveNeighboursRule().validate(field, 1, 1));
    }

    @Test
    public void DiedCellShouldLiveWith3LiveNeighbours() {
        boolean[][] field = {
                {false, true, true, false, false},
                {false, false, false, false, false},
                {true, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        assertTrue(new DiedCellShouldLiveWith3LiveNeighboursRule().validate(field, 1, 1));
    }

}