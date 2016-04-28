package test;

import main.JoinCharacters;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JoinCharactersTest {
    private static JoinCharacters joinCharacters;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        joinCharacters = new JoinCharacters();
    }

    @Test
    public void testJoin() throws Exception {
        char[] input = {'1','2','3'};
        int expected = 123;

        int actualResult = joinCharacters.join(input);

        Assert.assertEquals("Characters should be joined correctly",expected, actualResult);

    }
}
