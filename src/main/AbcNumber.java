package main;

/**
 * Created by Daniel Solo on 21.05.2016.
 */
public class AbcNumber {

    public int convert(String num) {

        String letters = "abcdefghij";
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            numbers.append(letters.indexOf(num.charAt(i)));
        }

        int result = 0;
        try {
            result = Integer.parseInt(numbers.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
