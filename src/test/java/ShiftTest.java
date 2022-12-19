import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShiftTest {

    @Test
    public void overlapOnlyOnBeginningTest() {
        Shift shiftA = new Shift("ShiftA", 10, 0, 12, 0, 10, 1, 2022);
        Shift shiftB = new Shift("ShiftA", 11, 0, 13, 0, 10, 1, 2022);

        assertTrue(shiftB.overlap(shiftA));
    }


    @Test
    public void overlapEntirelyTest() {
        Shift shiftA = new Shift("ShiftA", 10, 0, 12, 0, 10, 1, 2022);
        Shift shiftB = new Shift("ShiftA", 10, 20, 11, 30, 10, 1, 2022);

        assertTrue(shiftB.overlap(shiftA));

    }
}
