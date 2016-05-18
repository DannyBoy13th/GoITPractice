package test;

import main.PositiveAverageNumber;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Solo on 18.05.2016.
 */
public class PositiveAverageNumberTest {
    private static PositiveAverageNumber positiveAverageNumber;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        positiveAverageNumber = new PositiveAverageNumber();
    }

    @Test
    public void average() throws Exception {
        int a = 4;
        int b = 6;
        int expected = 5;
        int result = positiveAverageNumber.average(a,b);

        assertEquals(expected, result);

    }

}