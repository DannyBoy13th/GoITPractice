package main;

public class OddNumber {
    public int find(int[] input) {
        for (int i = 0; i < input.length; i++){
            if (input[i] % 2 != 0) return i;
        }
        return -1;
    }
}
