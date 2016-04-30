package test;

import main.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Daniel Solo on 30.04.2016.
 */
public class MatrixSnakeTraversalTest {
    private static MatrixSnakeTraversal matrixSnakeTraversal;

    @BeforeClass
    public static void SetUpClass() throws Exception{
        matrixSnakeTraversal = new MatrixSnakeTraversal();
    }

    @Test
    public void testPrint() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[] expected = {1,4,7,10,11,8,5,2,3,6,9,12};

        int[] actualResult = matrixSnakeTraversal.print(matrix);

        Assert.assertEquals("Numbers from matrix should be printed in snake order",expected, actualResult);

    }
}