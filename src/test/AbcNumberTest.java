package test;

import main.AbcNumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Daniel Solo on 24.05.2016.
 */
public class AbcNumberTest {
    private static AbcNumber abcNumber;

    @BeforeClass
    public static void SetUpClass() throws IOException{
        abcNumber = new AbcNumber();
    }

    @Test
    public void testConvert() throws Exception {

        String letters = "bcdefghij";
        int expected  = 123456789;

        int actualResult = abcNumber.convert(letters);

        Assert.assertEquals("Characters should be converted into numbers", expected, actualResult);

    }
}