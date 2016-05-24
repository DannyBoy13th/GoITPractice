package main;

/**
 * Created by Daniel Solo on 25.05.2016.
 */
public class SetZero {

    public int set(int num, int i) {

        String binary = Integer.toBinaryString(num);
        char[] bits = binary.toCharArray();

        if ((i >= 1) && (i <= bits.length)) {
            bits[bits.length - i] = '0';
        }

        if (num < 0) {
            bits[0] = '0';
            binary = String.valueOf(bits);
            return Integer.parseInt(binary, 2)*(-1)-2;
        }

        binary = String.valueOf(bits);
        return Integer.parseInt(binary, 2);
    }
}
