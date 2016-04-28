package test;

import main.OddNumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 29.04.2016.
 */
public class OddNumberTest {
    private static OddNumber oddNumber;

    @BeforeClass
    public static void SetUpClass() throws Exception {
        oddNumber = new OddNumber();
    }

    @Test
    public void testFind()throws Exception {

        int[] input = {4,6,8,12,2,14,22,9};

        int expectedIndex = 7;

        int actualResult = oddNumber.find(input);

        Assert.assertEquals("Odd number should be found",expectedIndex, actualResult);

    }

    @Test
    public void testFind2()throws Exception {

        int[] input = {4,6,8,12,2,14,22};

        int expectedIndex = -1;

        int actualResult = oddNumber.find(input);

        Assert.assertEquals("Odd number cannot be found",expectedIndex, actualResult);

    }
}
