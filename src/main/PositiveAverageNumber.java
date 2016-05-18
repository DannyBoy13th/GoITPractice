package main;

/**
 * Created by Daniel Solo on 18.05.2016.
 */
public class PositiveAverageNumber {
    public int average(int a, int b) {
        int numbers = a%2 + b%2;
        int result = a/2 + b/2;
        return result + numbers/2;
    }
}
