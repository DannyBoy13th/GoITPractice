package main;

/**
 * Created by Daniel Solo on 17.05.2016.
 */
public class AddNumberBase36 {
    public String add(String a, String b) {

        String numbers = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        a = new StringBuilder(a).reverse().toString().toLowerCase();
        b = new StringBuilder(b).reverse().toString().toLowerCase();

        int lengthOfMaxString;
        String stringOfMaxLength;
        if (a.length() >= b.length()){
            lengthOfMaxString = a.length();
            stringOfMaxLength = a;
        }else {
            lengthOfMaxString = b.length();
            stringOfMaxLength = b;
        }

        int reminder = 0;
        for (int i = 0; i < lengthOfMaxString; i++) {
            try {
                int sumOfIndex = numbers.indexOf(a.charAt(i)) + numbers.indexOf(b.charAt(i));
                if (sumOfIndex + reminder < 36) {
                    result.append(numbers.charAt(sumOfIndex + reminder));
                    reminder = 0;
                } else {
                    result.append(numbers.charAt(sumOfIndex + reminder - 36));
                    reminder = 1;
                }
            }catch (IndexOutOfBoundsException e){
                for (int j = i; j < lengthOfMaxString; j++) {
                    int index = numbers.indexOf(stringOfMaxLength.charAt(j));
                    if (index + reminder < 36) {
                        result.append(numbers.charAt(index + reminder));
                        reminder = 0;
                    } else {
                        result.append(numbers.charAt(index + reminder - 36));
                        reminder = 1;
                    }
                }
                break;
            }
        }
        if (reminder == 1) result.append(1);
        return result.reverse().toString();
    }
}
