package main;

/**
 * Created by Daniel Solo on 25.05.2016.
 */
public class CountBits {

    public int count(int num) {

        String binary = Integer.toBinaryString(num);

        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}
