package main;

/**
 * Created by Daniel Solo on 30.04.2016.
 */
public class MatrixSnakeTraversal {

    public int[] print(int[][] input) {
        int[] result = new int[input.length * input[0].length];

        int lines = input.length;
        int columns = input[0].length;

        int resultCount = 0;
        for (int y = 0; y < columns; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < lines; x++) {
                    result[resultCount] = input[x][y];
                    resultCount++;
                }
            } else {
                for (int x = lines - 1; x >= 0; x--) {
                    result[resultCount] = input[x][y];
                    resultCount++;
                }
            }
        }
        return result;
    }
}
