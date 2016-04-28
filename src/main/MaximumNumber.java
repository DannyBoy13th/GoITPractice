package main;

/**
 * Created by Daniel Solo on 29.04.2016.
 */
public class MaximumNumber {
    public int max(int[] input) {
        int maximumNumber = input[0];

        for(int i=0; i < input.length; i++){
            if (maximumNumber < input[i]) maximumNumber = input[i];
        }

        return maximumNumber;
    }
}
