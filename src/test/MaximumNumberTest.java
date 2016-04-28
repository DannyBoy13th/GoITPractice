package test;

import main.MaximumNumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 29.04.2016.
 */
public class MaximumNumberTest {

    private static MaximumNumber maximumNumber;

    @BeforeClass
    public static void SetUpClass() throws Exception {
        maximumNumber = new MaximumNumber();
    }

    @Test
    public void testMax() throws Exception{
        int[] input = {2, 6, 4, 78, 54, 2, 6, 8, 23, 74};

        int expected = 78;

        int actualResult = maximumNumber.max(input);

        Assert.assertEquals("Maximum number should be found",expected, actualResult);
    }
}