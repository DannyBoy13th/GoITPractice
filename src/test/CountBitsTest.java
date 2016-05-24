package test;

import main.CountBits;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 25.05.2016.
 */
public class CountBitsTest {
    private static CountBits countBits;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        countBits = new CountBits();
    }

    @Test
    public void testCount() throws Exception {

        int number = 13;

        int expected = 3;

        int actualResult = countBits.count(number);

        Assert.assertEquals(expected, actualResult);

    }
}