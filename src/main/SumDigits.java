package main;

public class SumDigits {

    public int sum(int number) {
        char[] intToChar = String.valueOf(number).toCharArray();

        int result = 0;

        for (int i = 0; i < intToChar.length; i++) {

            if (intToChar[i] != '-')
            result = result + (intToChar[i] - '0');
        }

        return result;
    }
}
