package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        Assertions.assertTrue("", Between0And37Randomizer::getRouletteResult.nextInt() < 37
            && Between0And37Randomizer.getRouletteResult.previousInt() > 0);

    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Assertions.assertThrows(Result.Color.GREEN,
                "Color of 0 and 00 is Green.");
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        Assertions.assertEquals(Result.Color.BLACK, Result.calculateNumber %2 == 0);
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        Assertions.assertEquals(Result.Color.RED, Result.calculateNumber %2 == 1);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {

        Assertions.assertThrows("Randomizer is greater than 37",
                JavaRandomizer::getRouletteResult());

    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {


    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}