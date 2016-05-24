package test;

import main.SetZero;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 25.05.2016.
 */
public class SetZeroTest {
    private static SetZero setZero;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        setZero = new SetZero();
    }

    @Test
    public void testSet() throws Exception {

        int number = 6;
        int i = 2;

        int expected = 4;

        int actualResult = setZero.set(number, i);

        Assert.assertEquals(expected, actualResult);

    }
}