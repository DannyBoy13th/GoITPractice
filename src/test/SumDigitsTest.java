package test;

import main.SumDigits;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumDigitsTest {
    private static SumDigits sumDigits;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        sumDigits = new SumDigits();
    }

    @Test
    public void testJoin() throws Exception {
        int number = 123;
        char[] intToChar = String.valueOf(number).toCharArray();

        int expected = 6;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("Characters should be summed",expected, actualResult);

    }

    @Test
    public void testJoin2() throws Exception {
        int number = 256;
        char[] intToChar = String.valueOf(number).toCharArray();

        int expected = 13;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("Characters should be summed",expected, actualResult);

    }

    @Test
    public void testJoin3() throws Exception {
        int number = -256;
        char[] intToChar = String.valueOf(number).toCharArray();

        int expected = 13;

        int actualResult = sumDigits.sum(number);

        Assert.assertEquals("Characters should be summed",expected, actualResult);

    }
}