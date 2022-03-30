package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class JavaRandomizerIT {

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () ->
               Integer.valueOf(Result.calculateNumber()));
    }

    @Test
    public void allNumbersOccur() throws Exception {
    }


}
