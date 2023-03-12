package Example;

import java.util.Scanner;

public class StringDivision {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        //01234
        //_4-|2
        //21

        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                int digit = c - '0';
                number *= 10;
                number += digit;
            }
        }
        System.out.println(number / 2);
    }
}
