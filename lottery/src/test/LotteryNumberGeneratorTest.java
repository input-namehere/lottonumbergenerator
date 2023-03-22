package test;

import main.LotteryNumberGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class LotteryNumberGeneratorTest {

    @Test
    public void testPickSixNumber() {
        LotteryNumberGenerator generator = new LotteryNumberGenerator();
        int[] numbers = generator.pickSixNumbers();

        assertEquals(6, number.lenght);

        for (int i = 0; i < numbers.length; i++) {
            assertTrue(numbers[i] >= 1 && numbers[i] <= 49);
        }
    }
}
